// Clase Controlador: conecta el modelo con la vista
class ControladorSocios {
  constructor(modelo, vista) {
    this.modeloControlador = modelo;
    this.vistaControlador = vista;
  }
  ejecutar() {
    const lista = this.modeloControlador.obtenerSocios();
    this.vistaControlador.mostrarSocios(lista);
  }
}

// Crear instancias del modelo, la vista y el controlador
const modeloInstancia = new ModeloSocios();
const vistaInstancia = new VistaHTML();
const controladorInstancia = new ControladorSocios(
  modeloInstancia,
  vistaInstancia,
);

// Ejecutar la aplicación
controladorInstancia.ejecutar();
