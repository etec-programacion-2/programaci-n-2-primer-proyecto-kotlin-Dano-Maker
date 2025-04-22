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
    
    Rectangulo() // ✅ Llamamos correctamente a la función
}

fun Rectangulo() {
    val ancho = 25
    val alto = 5
    val area = ancho * alto
    println("El ancho del rectángulo es $ancho, su altura es $alto y su área es $area")
}

// Opcional: función main para ejecutar
fun main() {
    mostrarTiposDeDatos()
}

