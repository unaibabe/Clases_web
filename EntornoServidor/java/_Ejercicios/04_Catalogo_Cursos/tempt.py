from PySide6 import QtWidgets, QtCore, QtGui
from PySide6.QtWidgets import QApplication
import sys
import random

# Definimos el SVG del pato en texto (puedes cambiarlo por cualquier otra figura)
PATO_SVG = """
<svg xmlns="http://w3.org" viewBox="0 0 24 24" width="40" height="40">
    <path fill="currentColor" d="M12,2A3,3 0 0,1 15,5V6H19A2,2 0 0,1 21,8V10A2,2 0 0,1 19,12H18.83C18.4,13.73 17.07,15.17 15.34,15.7L19.41,19.78C19.78,20.15 19.78,20.76 19.41,21.13L19.13,21.41C18.76,21.78 18.15,21.78 17.78,21.41L13.7,17.34C12.33,18.5 10.37,19 8.35,18.6C5.5,18 3.5,15.36 3.5,12.45V12A1,1 0 0,1 4.5,11H8.5V10H6.5A1,1 0 0,1 5.5,9V8A2,2 0 0,1 7.5,6H12V2M15,8V10H17V8H15Z"/>
</svg>
"""

class MiBotton(QtWidgets.QPushButton):
    def __init__(self, texto, padre):
        super().__init__(texto, padre)
        self.padre = padre
        self.bloqueado = False  # Bandera para saber si el pato está pausado

        # Configurar el botón plano para que solo se vea el SVG
        self.setFlat(True)
        self.resize(50, 50)

        # Cargar el SVG y establecer color inicial (Blanco o Negro según tu sistema, aquí gris oscuro)
        self.icon_item = QtGui.QIcon(QtGui.QPixmap.fromImage(QtGui.QImage.fromData(PATO_SVG.encode('utf-8'))))
        self.setIcon(self.icon_item)
        self.setIconSize(QtCore.QSize(45, 45))
        self.setStyleSheet("color: #333333; background: transparent;")

    def cambiarPosAleatoria(self):
        # Si está bloqueado (recibió un disparo), no se mueve
        if self.bloqueado:
            return

        posX = int(self.padre.width() - self.width())
        posY = int(self.padre.height() - self.height())

        # Aseguramos que no intente moverse fuera si la ventana es muy pequeña
        if posX > 0 and posY > 0:
            randomX = random.randint(0, posX)
            randomY = random.randint(0, posY)
            self.move(randomX, randomY)

class MiVentana(QtWidgets.QWidget):
    def __init__(self):
        super().__init__()
        self.setWindowTitle("¡Caza al Pato!")
        self.resize(300, 500)
        self.puntos = 0
        self.populate()

    def populate(self):
        # Creamos el botón pasándole un string vacío en lugar de "Press"
        self.boton = MiBotton("", self)
        self.boton.move(120, 200)

        self.boton.clicked.connect(self.sumarPuntos)

        self.label = QtWidgets.QLabel(str(self.puntos), self)
        self.label.move(10, 10)
        self.label.resize(100, 30)
        # Hacemos el marcador un poco más grande y visible
        self.label.setStyleSheet("font-size: 18px; font-weight: bold;")

        self.timer = QtCore.QTimer(self)
        self.timer.timeout.connect(self.boton.cambiarPosAleatoria)
        self.timer.start(1000)

    def sumarPuntos(self):
        # Si ya está bloqueado, ignoramos los clics extra durante ese segundo
        if self.boton.bloqueado:
            return

        self.puntos += 1
        self.label.setText(str(self.puntos))

        # Activar el estado de pausa/bloqueo
        self.boton.bloqueado = True
        self.boton.setStyleSheet("color: red; background: transparent;") # Se pone rojo

        # Esperar 1000ms (1 segundo) de forma asíncrona para restablecerlo
        QtCore.QTimer.singleShot(1000, self.restablecerPato)

    def restablecerPato(self):
        # Devolver el pato a su estado original y permitir que vuelva a moverse
        self.boton.setStyleSheet("color: #333333; background: transparent;")
        self.boton.bloqueado = False
        # Forzar un movimiento inmediato justo después de revivir
        self.boton.cambiarPosAleatoria()

app = QApplication(sys.argv)
window = MiVentana()
window.show()
sys.exit(app.exec())
