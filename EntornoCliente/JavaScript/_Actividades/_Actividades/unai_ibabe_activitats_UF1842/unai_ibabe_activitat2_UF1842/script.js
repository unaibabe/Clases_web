const urlImg = "./img";
const btnCalcular = document.getElementById("calcular");
const input = document.getElementById("temperatura");
const mensajeTemperatura = document.getElementById("mensaje-temperatura");
const mensaje = document.getElementById("mensaje-farenhait");
const imagen = document.getElementById("imagen");

btnCalcular.addEventListener("click", () => {
  let temperatura = parseInt(input.value);
  imagen.style.display = "block";
  if (temperatura >= -30 && temperatura <= -1) {
    mensajeTemperatura.innerText = "Muy baja";
    imagen.src = `${urlImg}/muuuuchoFrio.png`;
  } else if (temperatura >= 0 && temperatura <= 12) {
    mensajeTemperatura.innerText = "Temperatura baja";
    imagen.src = `${urlImg}/muchoFrio.png`;
  } else if (temperatura >= 13 && temperatura <= 25) {
    mensajeTemperatura.innerText = "Templada";
    imagen.src = `${urlImg}/dom.png`;
  } else if (temperatura >= 26 && temperatura <= 40) {
    mensajeTemperatura.innerText = "Alta";
    imagen.src = `${urlImg}/calor.png`;
  } else if (temperatura >= 40 && temperatura <= 60) {
    mensajeTemperatura.innerText = "Muy ALTA";
    imagen.src = `${urlImg}/muchoCalor.png`;
  } else {
    mensajeTemperatura.innerText = "Temperatura no valida";
    imagen.style.display = "none";
  }

  mensaje.textContent = `La temperatura es de ${temperatura}ºC con lo cual esto son ${conversorFarehait(temperatura)} Farehaits`;
});

// calcular farehait
function conversorFarehait(tempt) {
  return ((tempt * 9) / 5 + 32).toFixed(2);
}
