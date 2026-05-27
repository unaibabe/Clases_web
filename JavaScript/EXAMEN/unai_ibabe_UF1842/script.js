// Declarar todas las constantes del dom
const dni = document.getElementById("dni");
const nombre = document.getElementById("nombre");

const nota_1 = document.getElementById("nota-1");
const nota_2 = document.getElementById("nota-2");

const btn_registrar = document.getElementById("registrar");

const mensaje = document.getElementById("mensaje");

// Crear la lista de alumnos vacia, cada vez que se reinice se vacia
let listaAlumnos = [];

/* 
Funcion para guardar los alumnos en el array
Como solo comprobamos el dni no voy a poner lo demas
*/
function guardarAlumno() {
  if (comprobarRepetidos()) {
    mensaje.innerText = "Alumno ya registrado";
  } else {
    let alumno = {
      dni: dni.value.toUpperCase(),
      nombre: nombre.value,
    };
    listaAlumnos.push(alumno);
    console.log(listaAlumnos);
    return listaAlumnos;
  }
}
/* 
Recorro la lista si hay repetidos. Lo hago mirando si lo que hay escrito en el 
value que se va a poner coincide con alguno de la listaAlumnos
*/
function comprobarRepetidos() {
  for (let i = 0; i < listaAlumnos.length; i++) {
    //   console.log(listaAlumnos[i].dni);
    if (listaAlumnos[i].dni == dni.value.toUpperCase()) {
      //   mensaje.innerText = "Alumno ya registrado";
      return true;
      break;
    }
  }
}

/*
Funcion para calcular nota, puede escalarse a cualquier porcentaje y nota
*/
function calculo_nota(nota, valor) {
  // console.log(`La nota: ${nota.value} y el valor:${valor}`);
  if (nota.value > 10 || nota.value < 0) {
    //   console.log("NaN");
    return null;
  } else {
    let resultado = parseFloat((nota.value * valor) / 10).toFixed(2);
    //   console.log(resultado);
    return resultado;
  }
}
/*
Calcular la media de las notas que queramos. No es media como tal
sino una suma en verdad.
*/
function media() {
  let media =
    parseFloat(calculo_nota(nota_1, 6)) + parseFloat(calculo_nota(nota_2, 4));
  if (isNaN(media)) {
    mensaje.innerText = "Nota no valida";
  } else {
    mensaje.innerText = `Alumno: ${nombre.value.toUpperCase()} | Nota final es: ${media.toFixed(2)}`;
    return media;
  }
}

/*
Agrego la funcion click y le digo que haga las funciones de
media, la cual escribira el texto del alumno en el mensaje
guardarAlumno, la cual comprobara que no este repetido y si no lo esta lo guarda
// */
btn_registrar.addEventListener("click", () => {
  media();
  //   comprobarRepetidos();
  guardarAlumno();
});
