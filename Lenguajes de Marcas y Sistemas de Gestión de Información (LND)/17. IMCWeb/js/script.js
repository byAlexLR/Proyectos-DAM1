// Función para calcular el IMC
function imc(peso, alturaCm) {
    // Convierte la altura a metros
    const alturaM = alturaCm / 100;
    // Calcula el IMC
    const indiceIMC = peso / (alturaM * alturaM);
    // Redondea el resultado
    const redondeado = indiceIMC.toFixed(2);

    // Muestra un mensaje según el resultado
    if (indiceIMC < 18.5) {
        return `Tu IMC es ${redondeado} — Bajo de peso`;
    } else if (indiceIMC >= 18.5 && indiceIMC < 25) {
        return `Tu IMC es ${redondeado} — Normal`;
    } else if (indiceIMC >= 25 && indiceIMC < 30) {
        return `Tu IMC es ${redondeado} — Sobrepeso`;
    } else {
        return `Tu IMC es ${redondeado} — Obeso`;
    }
}

// Función para obtener los datos
function calcularIMC() {
    // Obtiene los valores ingresados y los parsea a diferentes unidades
    const peso = parseFloat(document.getElementById("peso").value);
    const altura = parseInt(document.getElementById("altura").value);
    const resultado = document.getElementById("resultado");

    // Comprueba lo introducido por el usuario, si son valores nulos muestra un mensaje de advertencia
    if (isNaN(peso) || isNaN(altura) || peso <= 0 || altura <= 0) {
        resultado.textContent = "Por favor, ingresa valores válidos para peso y altura.";
    } else {
        resultado.textContent = imc(peso, altura);
    }
}