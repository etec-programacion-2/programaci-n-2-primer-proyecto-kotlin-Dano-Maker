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


fun mostrarNumerosConWhile() {
    println("Números del 1 al 10 usando while:")
    var i = 1
    while (i <= 10) {
        println(i)
        i++
    }
}


fun mostrarNumerosConDoWhile() {
    println("Números del 1 al 10 usando do-while:")
    var i = 1
    do {
        println(i)
        i++
    } while (i <= 10)
}

fun factorial(n: Int): Long {
    if (n < 0) {
        throw IllegalArgumentException("El factorial no está definido para números negativos")
    }
    
    var resultado: Long = 1
    for (i in 1..n) {
        resultado *= i
    }
    return resultado
}

fun factorialRecursivo(n: Int): Long {
    if (n < 0) {
        throw IllegalArgumentException("El factorial no está definido para números negativos")
    }
    
    return if (n <= 1) 1 else n * factorialRecursivo(n - 1)
}


fun potencia(base: Double, exponente: Int): Double {
    if (base == 0.0 && exponente < 0) {
        throw IllegalArgumentException("No se puede elevar 0 a un exponente negativo")
    }
    
    var resultado = 1.0
    val expAbs = kotlin.math.abs(exponente)
    
    for (i in 1..expAbs) {
        resultado *= base
    }
    
    return if (exponente >= 0) resultado else 1.0 / resultado
}


fun potenciaConDefecto(base: Double = 2.0, exponente: Int = 1): Double {
    return potencia(base, exponente)
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

    println("Factorial de 5: ${factorial(5)}")
    println("Factorial recursivo de 5: ${factorialRecursivo(5)}")
    
    println("2^3 = ${potencia(2.0, 3)}")
    println("5^2 = ${potencia(5.0, 2)}")
    println("3^-2 = ${potencia(3.0, -2)}")
    

    println("Potencia con valores por defecto: ${potenciaConDefecto()}")  // 2^1 = 2.0
    println("Potencia con base por defecto: ${potenciaConDefecto(exponente = 3)}")  // 2^3 = 8.0
    println("Potencia con exponente por defecto: ${potenciaConDefecto(base = 5.0)}")  // 5^1 = 5.0
}

