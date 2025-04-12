"use strict";

// Declaración de variables y almacena el id del DOM
const cajonDiv = document.getElementById("cambioColor");
const colorTexto = document.getElementById("codigoColor");

// Función para generar un color aleatorio
function colorRandom() {
  // Cadena con los caracteres hexadecimales
  const caracteres = "0123456789ABCDEF";
  let color = "#";
  // Genera un color de 6 dígitos aleatorios
  for (let i = 0; i < 6; i++) {
    // Genera un número aleatorio entre 0 y 15 y lo valida con los caracteres, para tener un dígito válido
    color += caracteres[Math.floor(Math.random() * 16)];
  }
  // Devuelve el código del color generado
  return color;
}

// Evento para el div, que se ejecuta al hacer click
cajonDiv.addEventListener("click", () => {
  // Hace la llamada a la función, para generar el color
  const nuevoColor = colorRandom();
  // Asigna el color generado al div
  cajonDiv.style.backgroundColor = nuevoColor;
  // Asigna el color generado al texto
  colorTexto.textContent = `Color: ${nuevoColor}`;
});
