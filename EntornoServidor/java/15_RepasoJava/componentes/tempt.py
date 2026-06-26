import sys

from PySide6.QtCore import QSize, Qt
from PySide6.QtWidgets import QApplication, QMainWindow
from PySide6 import QtWidgets


class MiVentana(QtWidgets.QWidget):
    def __init__(self):
        super().__init__()
        self.contador = 0
        self.setWindowTitle("Mi Super ventana")
        self.resize(500,100)
        self.populate()

    def populate(self):
        mainLayout = QtWidgets.QVBoxLayout()

        layout1 = QtWidgets.QHBoxLayout()
        label = QtWidgets.QLabel("BOTON")
        self.boton = QtWidgets.QPushButton("Yo")

        self.setStyleSheet(
            '''
                QPushButton {
                    background-color: #fff;
                    color: #000;
                    border: 1px solid #ccc;
                    padding: 5px;
                    border-radius: 4px;
                }
                QPushButton:hover{
                    background-color:red;
                }
            '''
        )


        layout1.addWidget(label)
        layout1.addWidget(self.boton)

        layout2 = QtWidgets.QVBoxLayout()
        self.labelContador = QtWidgets.QLabel("0")
        layout2.addWidget(self.labelContador)
        

        
        mainLayout.addLayout(layout1)
        mainLayout.addLayout(layout2)
        
        # self.setLayout(layout1)
        self.setLayout(mainLayout)

    def setTextoLabel(self, texto):
        self.labelContador.setText(texto)
     

class Eventos():

    def __init__(self,ventana):
        self.contador = 0
        self.ventana = ventana

        self.ventana.boton.clicked.connect(self.contar)

    def contar(self):
        self.contador +=1
        print(self.contador)
        self.ventana.setTextoLabel(str(self.contador))


app = QApplication(sys.argv)

window = MiVentana()
controlador = Eventos(window)
window.show()

app.exec()