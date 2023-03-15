fun main(args: Array<String>) {
        val Alcancia = alcancia()

        while (true) {
                println("----- MENÚ -----")
                println("1. Agregar moneda")
                println("2. Mostrar cantidad de monedas")
                println("3. Calcular valor total")
                println("4. Vaciar alcancía")
                println("5. Reiniciar alcancía")
                println("6. Salir")

                print("Ingrese una opción: ")
                val opcion = readLine()?.toInt() ?: 0

                when (opcion) {
                        1 -> {
                                print("Ingrese el valor de la moneda a agregar: ")
                                val valor = readLine()?.toInt() ?: 0
                                Alcancia.agregarMoneda(valor)
                        }
                        2 -> Alcancia.mostrarCantidadMonedas()
                        3 -> {
                                val valorTotal = Alcancia.calcularValorTotal()
                                println("El valor total de las monedas en la alcancía es: $valorTotal")
                        }
                        4 -> Alcancia.vaciarAlcancia()
                        5 -> Alcancia.reiniciarAlcancia()
                        6 -> return
                        else -> println("Opción inválida")
                }
        }
}

        //Elaborado por John Becerra
