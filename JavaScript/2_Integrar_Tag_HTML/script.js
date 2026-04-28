function saludar(){
    alert("Hola que tal")
}
// funcion con parametros
function sumar(a,b){
    return a + b;
}
let resultado = sumar(3,5)
function mostrar_resultado(){
    document.getElementById("resultado").innerHTML = "El resultado es: " + resultado
}
