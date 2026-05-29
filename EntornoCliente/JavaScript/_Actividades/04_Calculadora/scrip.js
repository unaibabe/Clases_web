//AVISO HAY FALTAS DE ORTOGRAFIA no me dio tiempo a revisar todas!!!
// Primero ponemos las constantes principales
const pantalla = document.getElementById("pantalla");
let estado = 0;
pantalla.innerText = "0";
// Función para resetear, reestablece el tamaño de letra por si dio error
function reset() {
  pantalla.innerText = "0";
  pantalla.style.fontSize = "80px";
  // Los estados era para cuando tenias un resultado que se reseteara pero no me ha salido
  /*Al final los he dejado para que en el principio se quite  el 0, que antes la pantalla salia 
      en blanco.
  */
  estado = 0;
}
// Esta función recoge los valores al hacer click en cada botón del html y lo muestra en pantalla
function valores(numero) {
  if (estado == 0) {
    pantalla.innerText = "";
    pantalla.innerText += numero;
    estado = 1;
  } else if (estado == 1) {
    pantalla.innerText += numero;
  }
  // estado = 1;
  // pantalla.innerText = "";
  // pantalla.innerText += numero;
}
// Coge el valor de la pantalla y sin modificalo hace un eval para el calculo
function calcular() {
  console.log(estado);
  estado = 1;
  if (estado === 1) {
    let operacion = pantalla.innerText;
    try {
      let resutltado = eval(operacion); //.toFixed(2);
      // Si su division entre 1 el resto no es 0 quiere decir que es float asi que le ponemos 2 comas
      if (resutltado % 1 != 0) {
        console.log("soy integer");
        pantalla.innerText = resutltado.toFixed(2);
      } else {
        console.log("no soy integer");
        pantalla.innerText = resutltado;
      }

      // estado = 2;
    } catch (error) {
      pantalla.innerText = "operacion no valida";
      pantalla.style.fontSize = "25px";
    }
  }
}
// Función para pasar de valor a minus o a plus
function cambio() {
  let cambio = -pantalla.innerText;
  pantalla.innerText = cambio;
}
// Como no entendia bien este porcentaje he puesto que le haga el 21% para sacar el iva
function porcentaje_iva() {
  let numero = parseFloat(pantalla.innerText);
  let porcentaje = numero - numero * 0.21;
  // console.log(numero - numero * 0.21);
  pantalla.innerText = porcentaje;
}
// Creo que su fucnión real es esta de dividir entre 100
function porcentaje() {
  let numero = parseFloat(pantalla.innerText);
  let porcentaje = numero / 100;
  pantalla.innerText = porcentaje;
}
// Borra el último número del string
function borrarUltimo() {
  let valor = pantalla.innerText.slice(0, -1);
  pantalla.innerText = valor;
}

// Ayuda de IA para sacar que era en el documento y la lista con includes. Basicamente te detecta las teclas y las muestra en pantalla
document.addEventListener("keydown", (evento) => {
  const tecla = evento.key;
  console.log(tecla);
  if (tecla >= 0 && tecla <= 9) {
    if (estado == 0) {
      pantalla.innerText = "";
      pantalla.innerText += tecla;
      estado = 1;
    } else {
      pantalla.innerText += tecla;
    }
    // pantalla.innerText += tecla;
  } else if (tecla == "Enter") {
    calcular();
  } else if (["+", "-", "/", "*"].includes(tecla)) {
    pantalla.innerText += tecla;
  } else if (tecla == "Backspace") {
    borrarUltimo();
  }
});
