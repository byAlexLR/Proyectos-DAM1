"use strict";

// Se carga la clasificación de la liga
window.addEventListener("load", cargarClasi);

// Función que carga la clasificación de la liga
function cargarClasi() {
  // Se crea el objeto XMLHttpRequest
  let xhttp = new XMLHttpRequest();

  // Ejecuta la función mostrarClasi() cuando la petición se completa correctamente
  xhttp.onload = function () {
    mostrarClasi(this);
  };

  // Indica que se va a realizar una petición GET a "clasificacion.xml"
  xhttp.open("GET", "clasificacion.xml", true);
  xhttp.send();
}

// Función que muestra la clasificación de la liga
function mostrarClasi(xml) {
  // Se obtiene el objeto XMLHttpReponse
  let xmlDoc = xml.responseXML;
  let equipos = xmlDoc.getElementsByTagName("team");
  let tabla = "<table>";

  // Formato de la tabla (Columnas)
  tabla +=
    "<tr><th>Equipo</th><th>Pts</th><th>PJ</th><th>PG</th><th>PE</th><th>PP</th><th>GF</th><th>GC</th></tr>";

  for (let i = 0; i < equipos.length; i++) {
    // Variables de cada uno de los datos del xml
    let nombre = equipos[i].getElementsByTagName("name")[0].childNodes[0].nodeValue;
    let orden = equipos[i].getElementsByTagName("rank")[0].childNodes[0].nodeValue;
    let puntos = equipos[i].getElementsByTagName("points")[0].childNodes[0].nodeValue;
    let jugados = equipos[i].getElementsByTagName("played")[0].childNodes[0].nodeValue;
    let ganados =equipos[i].getElementsByTagName("won")[0].childNodes[0].nodeValue;
    let empatados =equipos[i].getElementsByTagName("drawn")[0].childNodes[0].nodeValue;
    let perdidos =equipos[i].getElementsByTagName("lost")[0].childNodes[0].nodeValue;
    let gf =equipos[i].getElementsByTagName("goals_scored")[0].childNodes[0].nodeValue;
    let gc =equipos[i].getElementsByTagName("goals_conceded")[0].childNodes[0].nodeValue;

    // Clase para estilos de fondo según la posición
    let clase = "";
    if (i < 4) {
      clase = "champions";
    } else if (i === 4) {
      clase = "europa";
    } else if (i === 5) {
      clase = "conference";
    } else if (i >= equipos.length - 4) {
      clase = "descenso";
    }

    // Insercción de fila
    tabla += "<tr class='" + clase + "'>" +
    //"<td><strong>" + (i + 1) + ". " + nombre + "</strong></td>" + // Dentro del archivo existe un dato rank con el número de posición.
    "<td><strong>" + orden + ". " + nombre + "</strong></td>" +
    "<td>" + puntos + "</td>" +
    "<td>" + jugados + "</td>" +
    "<td>" + ganados + "</td>" +
    "<td>" + empatados + "</td>" +
    "<td>" + perdidos + "</td>" +
    "<td>" + gf + "</td>" +
    "<td>" + gc + "</td>" +
    "</tr>";
  }

  // Cierre de la etiqueta tabla
  tabla += "</table>";
  // Insercción de la tabla en el documento
  document.getElementById("resultado").innerHTML = tabla;
}
