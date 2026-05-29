class nombreControlador{
    constructor(modelo,vista){
        this.modelo = modelo;
        this.vista = vista;
    }

    //método para manejar la acción de convertir en mayúsculas
    manejarConvertirNombre(){
        //obtener el nombre del cuadro de entrada
        const nombre = this.vista.obtenerNombre();

        //guardar el nombre del modelo
        this.modelo.establecerNombre(nombre);

        //obtener nombre en mayúsculas del modelo
        const nombreEnMayusculas = this.modelo.obtenerNombreEnMayusculas();

        //mostrar el resultado en la vista
        this.vista.mostrarNombreEnMayusculas(nombreEnMayusculas);

    }
}

