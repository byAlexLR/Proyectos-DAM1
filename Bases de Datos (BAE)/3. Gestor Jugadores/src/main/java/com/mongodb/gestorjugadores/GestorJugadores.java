/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mongodb.gestorjugadores;

// Importación de librerías, de la base de datos (Mongo).
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import org.bson.Document;

// Librerías de java.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author byAlexLR
 */
public class GestorJugadores {

    // Declaración de las variables, e inicialización.
    private static final String DATABASE_NAME = "equipoFutbol";
    private static final String COLLECTION_NAME = "jugadores";
    private static MongoClient mongoClient;
    private static MongoCollection<Document> collection;
    private static Scanner sc;

    public static void main(String[] args) {
        try {
            // Para limpiar la salida de Logs y que únicamente salgan los errores.
            ch.qos.logback.classic.Logger root = (ch.qos.logback.classic.Logger) org.slf4j.LoggerFactory.getLogger("org.mongodb.driver");
            root.setLevel(ch.qos.logback.classic.Level.ERROR);
            // Llama al método para conectarse a la BBDD.
            conectarMongoDB();
            // Inicialización del Scanner.
            sc = new Scanner(System.in);
            // Llama al método para mostrar el menú.
            mostrarMenu();
        } catch (Exception ex) {
            // En caso de excepción lanza este mensaje.
            System.err.println("Error: " + ex.getMessage());
        } finally {
            // Cierra las conexiones.
            if (sc != null) {
                sc.close();
            }
            if (mongoClient != null) {
                mongoClient.close();
            }
        }
    }

    private static void conectarMongoDB() {
        // Cadena de conexion con la base de datos MongoDB.
        String uri = "mongodb://localhost:27017/";

        // Se abre la conexión con MongoDB.
        try {
            mongoClient = MongoClients.create(uri);
            // Obtener o crear una base de datos MongoDB desde Java.
            MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
            System.out.println("Base de datos creada o conectada.");

            // Obtener o crear una colección MongoDB.
            collection = database.getCollection(COLLECTION_NAME);
            System.out.println("Colección creada en la base de datos.");

        } catch (Exception ex) {
            System.err.println("Error con la conexión o creacción de la base de datos: " + ex.getMessage());
        }
    }

    private static void mostrarMenu() {
        // Variable para seleccionar la opción.
        int opcion = 0;
        // Bucle para mostrar el menú e ir a las opciones.
        do {
            // Mensaje para el usuario.
            System.out.println("""
                               \n=== GESTOR DE JUGADORES ===
                               1. Registrar nuevo jugador.
                               2. Mostrar todos los jugadores.
                               3. Actualizar datos de jugador.
                               4. Eliminar jugador.
                               5. Buscar jugador por posición.
                               6. Salir.
                               """);
            System.out.print("Selecciona una de las opciones: ");
            try {
                // Lee lo introducido por el usuario.
                opcion = Integer.parseInt(sc.nextLine());

                // Switch, para llamar al método de la opción seleccionada.
                switch (opcion) {
                    case 1 ->
                        registrarJugador();
                    case 2 ->
                        listarJugadores();
                    case 3 ->
                        actualizarJugador();
                    case 4 ->
                        eliminarJugador();
                    case 5 ->
                        buscarJugadoresPorPosicion();
                    case 6 ->
                        System.out.println("Acabas de salir del Gestor de Jugadores. ¡Hasta pronto!");
                    default ->
                        System.out.println("Opción inválida. Seleccionada una opción válida.");
                }
                // Captura de la excepción, para un número que se introduzca un valor valido.
            } catch (NumberFormatException ex) {
                System.err.println("Error: Debe ingresar un número válido.");
            }
        } while (opcion != 6);
    }

    private static void registrarJugador() {
        // Muestra un mensaje de la sección en la que se encuentra.
        System.out.println("\n=== REGISTRAR NUEVO JUGADOR ===");

        try {

            // Le pide al usuario que inserte los datos correspondientes al jugador.
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Posición: ");
            String posicion = sc.nextLine();

            System.out.print("Edad: ");
            int edad = Integer.parseInt(sc.nextLine());

            System.out.print("Número de camiseta: ");
            int numero = Integer.parseInt(sc.nextLine());

            // Verificar si ya existe un jugador con ese número de camiseta.
            Document jugadorExistente = collection.find(Filters.eq("numero", numero)).first();
            if (jugadorExistente != null) {
                System.out.println("Ya existe un jugador con el número de camiseta " + numero);
                return;
            }

            // Inserta un documento en la colección.
            Document nuevoJugador = new Document().append("nombre", nombre).append("posicion", posicion).append("edad", edad).append("numero", numero);
            collection.insertOne(nuevoJugador);

            // Comunica que se ha insertado correctamente.
            System.out.println("Jugador registrado correctamente.");

            // Captura las posibles excepciones.
        } catch (NumberFormatException ex) {
            System.err.println("Debe ingresar un valor numérico válido para la edad o número de camiseta.");
        } catch (Exception ex) {
            System.err.println("Error al registrar el jugador: " + ex.getMessage());
        }
    }

    private static void listarJugadores() {
        // Muestra un mensaje de la sección en la que se encuentra.
        System.out.println("\n=== LISTA DE JUGADORES ===");

        try {
            // Lista para obtener los jugadores.
            List<Document> jugadores = collection.find().into(new ArrayList<>());

            // Muestra un mensaje si no tiene datos.
            if (jugadores.isEmpty()) {
                System.out.println("No hay jugadores registrados.");
                return;
            }

            // Imprime los datos del jugador.
            System.out.printf("%-20s %-15s %-6s %-8s%n", "NOMBRE", "POSICIÓN", "EDAD", "NÚMERO");
            System.out.println("----------------------------------------------------");

            // Se recorre la lista de jugadores y los va insertando en el printf.
            for (Document jugador : jugadores) {
                System.out.printf("%-20s %-15s %-6d %-8d%n",
                        jugador.getString("nombre"),
                        jugador.getString("posicion"),
                        jugador.getInteger("edad"),
                        jugador.getInteger("numero"));
            }
            // Captura las posibles excepciones.
        } catch (Exception ex) {
            System.err.println("Error al listar los jugadores: " + ex.getMessage());
        }
    }

    private static void actualizarJugador() {
        // Muestra un mensaje de la sección en la que se encuentra.
        System.out.println("\n=== ACTUALIZAR JUGADOR ===");

        try {
            // Pregunta el nombre del jugador a actualizar.
            System.out.print("Nombre del jugador a actualizar: ");
            String nombre = sc.nextLine();

            // Busca al jugador por el nombre.
            Document jugador = collection.find(Filters.eq("nombre", nombre)).first();

            // En el caso de que no se encuentre, lo comunica.
            if (jugador == null) {
                System.out.println("No se encontró ningún jugador con ese nombre.");
                return;
            }

            // Muestra los datos actuales.
            System.out.println("------------------------------ DATOS ACTUALES ------------------------------");
            System.out.println("Posición: " + jugador.getString("posicion") + ", Edad: " + jugador.getInteger("edad") + ", Número: " + jugador.getInteger("numero"));
            System.out.println("----------------------------------------------------------------------------");

            // Solicita al usuario los nuevos datos.
            System.out.println("\nIngresa los nuevos datos (para no modificar el campo, déjalo en blanco):");

            System.out.print("Nueva posición: ");
            String nuevaPosicion = sc.nextLine();

            System.out.print("Nueva edad: ");
            String edadStr = sc.nextLine();

            System.out.print("Nuevo número: ");
            String numeroStr = sc.nextLine();

            // Variable para controlar si se realizó alguna actualización.
            boolean actualizacionRealizada = false;

            // Comprueba si la nueva posición tiene datos y lo asigna.
            if (!nuevaPosicion.isEmpty()) {
                collection.updateOne(
                        Filters.eq("nombre", nombre),
                        Updates.set("posicion", nuevaPosicion)
                );
                actualizacionRealizada = true;
            }

            // Comprueba si la nueva edad tiene datos y lo asigna, si es un valor válido.
            if (!edadStr.isEmpty()) {
                try {
                    int nuevaEdad = Integer.parseInt(edadStr);
                    collection.updateOne(
                            Filters.eq("nombre", nombre),
                            Updates.set("edad", nuevaEdad)
                    );
                    actualizacionRealizada = true;
                } catch (NumberFormatException e) {
                    System.out.println("La edad debe ser un número válido.");
                    actualizacionRealizada = false;
                }
            }

            // Comprueba si el nuevo número tiene datos y lo asigna, si es un valor válido.
            if (!numeroStr.isEmpty()) {
                try {
                    int nuevoNumero = Integer.parseInt(numeroStr);

                    // Verifica si el número introducido ya lo usa otro jugador.
                    Document otroJugador = collection.find(Filters.and(
                            Filters.eq("numero", nuevoNumero),
                            Filters.ne("nombre", nombre))).first();

                    // En el caso de que ya se use ese número lo comunica, y sino, lo actualiza.
                    if (otroJugador != null) {
                        System.out.println("El número " + nuevoNumero + " ya está en uso por otro jugador.");
                    } else {
                        collection.updateOne(
                                Filters.eq("nombre", nombre),
                                Updates.set("numero", nuevoNumero)
                        );
                        actualizacionRealizada = true;
                    }
                    // Captura las posibles excepciones que surgan con los números inválidos.
                } catch (NumberFormatException ex) {
                    System.err.println("El número debe ser un valor numérico válido.");
                    actualizacionRealizada = false;
                }
            }

            // Comunica la actualización del jugador.
            if (actualizacionRealizada) {
                System.out.println("Jugador actualizado correctamente.");
            }

            // Captura las posibles excepciones.
        } catch (Exception ex) {
            System.err.println("Error al actualizar el jugador: " + ex.getMessage());
        }
    }

    private static void eliminarJugador() {
        // Muestra un mensaje de la sección en la que se encuentra.
        System.out.println("\n=== ELIMINAR JUGADOR ===");

        try {
            // Pregunta el nombre del jugador a eliminar.
            System.out.print("Nombre del jugador a eliminar: ");
            String nombre = sc.nextLine();

            // Pregunta si está seguro.
            System.out.print("¿Está seguro que deseas eliminar al jugador \"" + nombre + "\"? (S/N): ");
            String confirmacion = sc.nextLine();

            // En el caso de que diga que no, lo cancela.
            if (!confirmacion.equalsIgnoreCase("S")) {
                System.out.println("Eliminación cancelada.");
                return;
            }

            // Busca al jugador por el nombre y lo elimina.
            DeleteResult resultado = collection.deleteOne(Filters.eq("nombre", nombre));

            // Muestra un mensaje de confirmación o no, de si el jugador se ha eliminado correctamente.
            if (resultado.getDeletedCount() > 0) {
                System.out.println("Jugador eliminado correctamente.");
            } else {
                System.out.println("No se encontró ningún jugador con ese nombre.");
            }

            // Captura las posibles excepciones.
        } catch (Exception ex) {
            System.err.println("Error al intentar eliminar el jugador: " + ex.getMessage());
        }
    }

    private static void buscarJugadoresPorPosicion() {
        // Muestra un mensaje de la sección en la que se encuentra.
        System.out.println("\n=== BUSCAR JUGADOR POR POSICIÓN ===");

        try {
            // Pregunta la posición del jugador.
            System.out.print("Ingrese la posición a buscar: ");
            String posicion = sc.nextLine();

            // Buscar jugadores por posición.
            List<Document> jugadores = collection.find(Filters.eq("posicion", posicion)).into(new ArrayList<>());

            // Muestra un mensaje si no se encuentra la posición.
            if (jugadores.isEmpty()) {
                System.out.println("No se encontraron jugadores en la posición especificada: " + posicion);
                return;
            }

            // Imprime los datos del jugador.
            System.out.println("\n=== JUGADORES EN LA POSICIÓN " + posicion + " ===");
            System.out.printf("%-20s %-6s %-8s%n", "NOMBRE", "EDAD", "NÚMERO");
            System.out.println("----------------------------------------------------");

            // Se recorre la lista de jugadores y los va insertando en el printf.
            for (Document jugador : jugadores) {
                System.out.printf("%-20s %-6d %-8d%n",
                        jugador.getString("nombre"),
                        jugador.getInteger("edad"),
                        jugador.getInteger("numero"));
            }

            // Captura las posibles excepciones.
        } catch (Exception ex) {
            System.err.println("Error al buscar jugadores por la posición: " + ex.getMessage());
        }
    }
}
