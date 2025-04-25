package org.example

fun mostrarTiposDeDatos() {
    val nombre: String = "Dano"
    val edad: Int = 16
    val altura: Double = 1.75
    val esEstudiante: Boolean = true

    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Altura: $altura")
    println("Es estudiante: $esEstudiante")
    
    Rectangulo()
}

fun Rectangulo() {
    val ancho = 25
    val alto = 5
    val area = ancho * alto
    println("El ancho del rectángulo es $ancho, su altura es $alto y su área es $area")
}


fun esParOImpar(numero: Int) {
    when (numero % 2) {
        0 -> println("El número $numero es par")
        else -> println("El número $numero es impar")
    }
}

fun determinarTipoDeNumero(numero: Int): String {
    return when {
        numero > 0 -> "El número es positivo"
        numero < 0 -> "El número es negativo"
        else -> "El número es cero"
    }
}

fun mostrarNumerosConFor() {
    println("Números del 1 al 10 usando for:")
    for (i in 1..10) {
        println(i)
    }
}

// Función que muestra números del 1 al 10 usando while
fun mostrarNumerosConWhile() {
    println("Números del 1 al 10 usando while:")
    var i = 1
    while (i <= 10) {
        println(i)
        i++
    }
}

// Función que muestra números del 1 al 10 usando do-while
fun mostrarNumerosConDoWhile() {
    println("Números del 1 al 10 usando do-while:")
    var i = 1
    do {
        println(i)
        i++
    } while (i <= 10)
}


fun main() {
    mostrarTiposDeDatos()
    esParOImpar(7)
    esParOImpar(12)
    esParOImpar(50)
    esParOImpar(-3)
    esParOImpar(0)
    println("${determinarTipoDeNumero(5)}")   
    println(determinarTipoDeNumero(-3))  
    println(determinarTipoDeNumero(0))   
    mostrarNumerosConFor()
    println()
    
    mostrarNumerosConWhile()
    println()
    
    mostrarNumerosConDoWhile()
}
