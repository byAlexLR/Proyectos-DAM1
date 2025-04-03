"use strict";

///////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////// EJERCICIO 1 //////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////

// Pide al usuario que introduzca una letra
let letra = prompt("Introduce una letra: ");

// Función para comprobar si es una vocal
function esVocal(letra) {
  // Array de vocales en minúsculas
  const vocales = ['a', 'e', 'i', 'o', 'u'];

  // Convierte la letra insertada en minúscula para realizar la comparación
  letra = letra.toLowerCase();

  // Devuelve el resultado de si la letra introducida existe en el array de vocales
  return vocales.includes(letra);
}

// Muestra por consola un true o false dependiendo de si es una vocal o no
console.log(esVocal(letra));

///////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////// EJERCICIO 2 //////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////

// Inicializa el array con los números iniciales
let array = [1, 2, -3, -1, 2, 4, 4, 1, 45, -1];

// Función para obtener el array con valores únicos y ordenados
function procesarArray(array) {
  // Duplica el array inicializado anteriormente pero solo con los valores únicos, para ello utiliza el objeto set
  let arrayUnicos = Array.from(new Set(array));

  // Ordena el array de menor a mayor
  arrayUnicos.sort((a, b) => a - b);

  // Devuelve el array con los valores únicos y ordenados
  return arrayUnicos;
}

// Muestra por consola el array con los valores únicos y ordenados
console.log(procesarArray(array));

///////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////// EJERCICIO 3 //////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////

// Inicializa el array con la clasificación inicial
let clasificaciones = ["Ana", "Oswaldo", "Raúl", "Celia", "María", "Antonio"];

// Muestra por consola la clasificación inicial
console.log("Clasificación inicial:", clasificaciones);

// Mueve a Celia delante de Raúl
clasificaciones.push(clasificaciones.shift());
clasificaciones.push(clasificaciones.shift());
clasificaciones.shift();
clasificaciones.push("Celia"); 
clasificaciones.push("Raúl");
clasificaciones.shift();
clasificaciones.push(clasificaciones.shift());
clasificaciones.push(clasificaciones.shift());

// Elimina el último elemento de la clasificación, es decir, Antonio
clasificaciones.pop();

// Agrega a Roberto y Amaya después de Ana
clasificaciones.push(clasificaciones.shift()); // Ana al final
clasificaciones.unshift("Amaya"); // Agregar Amaya al principio
clasificaciones.unshift("Roberto"); // Agregar Roberto al principio
clasificaciones.unshift(clasificaciones.pop()); // Mover Ana al principio

// Inserta a Marta al principio de la clasificación
clasificaciones.unshift("Marta");

// Muestra por consola la clasificación actualizada
console.log("Clasificación actualizada:", clasificaciones);
