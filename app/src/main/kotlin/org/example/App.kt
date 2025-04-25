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

fun llamarfunciones() {
    mostrarTiposDeDatos()
     esParOImpar(7)
    esParOImpar(12)
    esParOImpar(50)
    esParOImpar(-3)
    esParOImpar(0)
}