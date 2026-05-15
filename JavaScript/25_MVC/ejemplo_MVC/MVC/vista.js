class nombreVista{
    constructor(){
        this.introducirNombre = document.getElementById("introducirNombre");
        this.mensajeP = document.getElementById("mensaje");
    }

    //método para obtener el nombre
    obtenerNombre(){
        return this.introducirNombre.value;
    }

    //método para mostrar el nombre
    mostrarNombreEnMayusculas(nombre){
        this.mensajeP.innerHTML = "Nombre en mayúsculas: "+ nombre;
    }
}

