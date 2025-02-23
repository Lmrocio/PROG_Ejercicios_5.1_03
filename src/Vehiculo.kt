interface Vehiculo {
    var motorEncendido: Boolean
    var kmHora: Int

    fun acelerar(kmh: Int)
    fun frenar(kmh: Int)

}