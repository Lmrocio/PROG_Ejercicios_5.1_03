class Coche (override var encendido: Boolean = false,
             override var kmHora: Int,
             override var motorEncendido: Boolean = false) : EncendidoApagado, Vehiculo {


    /**
     * Reescribe la función de la interfaz EncendidoApgado para cambiar el valor de motorEncendido
     */
    override fun encender(){
       if(!motorEncendido){
           motorEncendido = true
           println("El motor del coche está encendido")

       }else println("El motor ya estaba encendido")
    }

    /**
     * Reescribe la función de la interfaz EncendidoApagado para cambiar el valor de motorEncendido
     */
    override fun apagar() {
        if(motorEncendido){
            motorEncendido = false
            println("Apagando el motor del coche")

        } else println("El motor ya estaba apagado")
    }

    /**
     * Reescribe la función acelerar de la interfaz Vehículo para aumentar los kmHora del coche.
     *
     * @param kmh: Int son los kilometros/hora que queremos aumentar.
     */
    override fun acelerar(kmh: Int) {
        if(motorEncendido){
            kmHora += kmh
            println("El coche ha acelerado a $kmHora km/h.")

        }else println("El coche no puede acelerar porque está apagado.")
    }

    /**
     * Reescribe la función frenar de la interfaz Vehículo para disminuir los kmHora del coche.
     *
     * @param kmh: Int son los kilometros/horas que queremos disminuir
     */
    override fun frenar(kmh: Int) {
        if(motorEncendido){
            kmHora -= kmh

            if(kmHora < 0){
                kmHora = 0
                println("Se ha parado la marcha")

            } else println("Se ha disminuido a $kmHora km/h.")

        }else println("El coche no disminuir su marcha porque está apagado.")
    }
}