class alcancia {
    private val denominaciones = intArrayOf(20, 50, 100, 200, 500)
    private val cantidades = IntArray(denominaciones.size)

    fun agregarMoneda(denominacion: Int) {
        val indice = denominaciones.indexOf(denominacion)
        if (indice != -1) {
            cantidades[indice]++
            println("Se ha agregado una moneda de $denominacion")
        } else {
            println("No se pueden agregar monedas de esa denominación")
        }
    }

    fun mostrarCantidadMonedas() {
        for (i in denominaciones.indices) {
            println("Monedas de ${denominaciones[i]}: ${cantidades[i]}")
        }
    }

    fun calcularValorTotal(): Int {
        var total = 0
        for (i in denominaciones.indices) {
            total += denominaciones[i] * cantidades[i]
        }
        return total
    }

    fun vaciarAlcancia() {
        println("Se han sacado todas las monedas:")
        for (i in denominaciones.indices) {
            println("${cantidades[i]} monedas de ${denominaciones[i]}")
            cantidades[i] = 0
        }
    }

    fun reiniciarAlcancia() {
        for (i in denominaciones.indices) {
            cantidades[i] = 0
        }
        println("Se ha reiniciado la alcancía")
    }
}