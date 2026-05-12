const botonAtras = document.getElementById("flecha-atras");
const botonAdelante = document.getElementById("flecha-adelante");
const imagenPrincipal = document.getElementById("imagen-principal");
const numero = document.getElementById("numero");
const descripcion = document.getElementById("descripcion");

const imagenes = [
  { src: "./img/city.jpg", alt: "Ciudad", descripcion: "Ciudad" },
  { src: "./img/desierto.jpg", alt: "Bosque", descripcion: "Bosque" },
  { src: "./img/lago.jpg", alt: "Playa", descripcion: "Playa" },
  { src: "./img/landscape.jpg", alt: "Montaña", descripcion: "Montaña" },
];

let contador = 0;

function cambiarImagen(direccion) {
  if (direccion == "adelante") {
    contador++;
    // imagenPrincipal.style.transform = `transform: translateX(1s,5000px)`;
    if (contador >= imagenes.length) {
      contador = 0;
    }
  } else if (direccion == "atras") {
    contador--;
    if (contador <= 0) {
      contador = imagenes.length - 1;
    }
  }
  console.log(`${contador} + 1`);
  numero.innerText = `${contador + 1}/${imagenes.length}`;
  descripcion.innerText = `${imagenes[contador].descripcion}`;
  imagenPrincipal.src = `${imagenes[contador].src}`;

  // Audio al cambiar
  const audio = new Audio("./sfx/whoosh.wav");
  audio.play();
  audio.currentTime = 0;
}
//   if (contador >= imagenes.length) {
//     // console.log("ESTOY REINICIANDO");
//     contador = 0;
//     numero.innerText = `${contador + 1}/${imagenes.length}`;
//     descripcion.innerText = `${imagenes[contador].descripcion}`;
//     imagenPrincipal.src = `${imagenes[contador].src}`;
//   } else {
//     // console.log(`ESTOY SUMANDO ${contador}`);
//     numero.innerText = `${contador + 1}/${imagenes.length}`;
//     descripcion.innerText = `${imagenes[contador].descripcion}`;
//     imagenPrincipal.src = `${imagenes[contador].src}`;
//   }
// }

botonAtras.addEventListener("click", () => {
  cambiarImagen("atras");
});
botonAdelante.addEventListener("click", () => {
  cambiarImagen("adelante");
});
