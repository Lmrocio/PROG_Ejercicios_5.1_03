fun main(){
    val telefono = Telefono(true)

    val lavadora = Lavadora(false)

    val coche = Coche( kmHora = 45)


    telefono.apagar()
    telefono.apagar()
    telefono.encender()

    lavadora.encender()
    lavadora.reiniciar()

    coche.encender()
    coche.acelerar(5)
    coche.frenar(51)
    coche.apagar()
}