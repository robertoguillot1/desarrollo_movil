fun main() {
    var continuar: String

    do {
        println("Por favor, introduce tu edad:")
        val edad = readLine()?.toIntOrNull()

        if (edad != null && edad > 0) {
            clasificarEdad(edad)
        } else {
            println("⚠️ Edad inválida, por favor ingrese un número positivo.")
        }


        println("¿Desea seguir consultando? (si/no)")
        continuar = readLine()?.lowercase() ?: "no"

    } while (continuar == "si")

    println("✅ Programa finalizado. ¡Gracias!")
}


fun clasificarEdad(edad: Int) {
    if (edad >= 18) {
        println("El usuario es mayor de edad.")
    } else {
        println("El usuario es menor de edad.")
    }


    val rango = when (edad) {
        in 1..15 -> "Niño"
        in 16..25 -> "Adolescente"
        in 26..30 -> "Joven"
        in 31..60 -> "Adulto"
        in 61..80 -> "Anciano"
        else -> "Fuera de rango definido"
    }

    println("Pertenece al rango: $rango")
}
