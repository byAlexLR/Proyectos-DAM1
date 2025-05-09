const form = document.getElementById("form");
const input = document.getElementById("buscar");
const list = document.getElementById("ciudades");
const error = document.getElementById("error");
const apiKey = "b6e7d6bfea56376e0eba03513e1ce329";

// Inicializar la aplicación
form.addEventListener("submit", (event) => {
  event.preventDefault();
  const city = input.value.trim();

  if (city === "") {
    error.textContent = "Por favor, introduce una ciudad.";
    return;
  }

  fetchWeatherData(city);
});

// Función para obtener datos meteorológicos
function fetchWeatherData(city) {
  const url = `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${apiKey}&units=metric&lang=es`;

  fetch(url)
    .then((response) => {
      if (!response.ok) {
        throw new Error("Ciudad no encontrada");
      }
      return response.json();
    })
    .then((data) => {
      error.textContent = "";
      renderCard(data);
    })
    .catch(() => {
      error.textContent = "Por favor, busca una ciudad válida 😩";
    });

  form.reset();
}

// Renderizar los datos meteorológicos en la lista
function renderCard(data) {
  const { main, name, sys, weather } = data;
  const card = document.createElement("div");
  card.className = "ciudad";
  const icon = `https://openweathermap.org/img/wn/${weather[0].icon}@2x.png`;

  card.innerHTML = `
      <h2 class="ciudad-nombre" data-name="${name},${sys.country}">
          <span>${name}</span>
          <sup>${sys.country}</sup>
      </h2>
      <div class="tiempo">${Math.round(main.temp)}<sup>°C</sup></div>
      <figure>
          <img class="ciudad-icono" src="${icon}">
          <figcaption>${weather[0]["description"]}</figcaption>
      </figure>
  `;
  list.appendChild(card);
}