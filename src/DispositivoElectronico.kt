interface DispositivoElectronico {

    /**
     * Muestra el inicio del reiniciado de un dispositivo
     */
    fun reiniciar(){
        println("Reiniciando dispositivo ${this::class.simpleName}...")
    }

}