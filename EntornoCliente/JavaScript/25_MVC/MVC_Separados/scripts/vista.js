// Clase Vista: se encarga de mostrar la información
class VistaHTML {
  mostrarSocios(listaDeSocios) {
    listaDeSocios.forEach((socio) => {
      document.write("<p>" + socio + "</p>");
    });
  }
}
