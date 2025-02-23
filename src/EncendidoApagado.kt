interface EncendidoApagado {
    var encendido: Boolean

    /**
     * Esta función enciende un dispositivo
     *
     */
    fun encender() {
        if (!encendido) {
            encendido = true
            println("El dispositivo ${this::class.simpleName} se acaba de encender.")
        } else println("El dispositivo ${this::class.simpleName} ya está encendido.")
    }

    /**
     * Esta función apaga un dispositivo
     *
     */
    fun apagar(){
        if(encendido){
            encendido = false
            println("El dispositivo ${this::class.simpleName} se acaba de apagar.")
        } else println("El dispositivo ${this::class.simpleName} ya está apagado")
    }

}