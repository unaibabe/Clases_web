
class nombreModelo{
    //inicializamos la variable
    constructor(){
        //this.nombre="";
        this.nombre = /^[A-Za-záéíóúÁÉÍÓÚñÑ\s]{5,15}$/;
    }

    //le damos el valor
    establecerNombre(nombre){ 
        this.nombre = nombre;
    }

    //convertimos en mayúsculas
    obtenerNombreEnMayusculas(){
        return this.nombre.toUpperCase();
    }
}

