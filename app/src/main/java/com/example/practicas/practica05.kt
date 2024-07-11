package com.example.practicas

//Programa que nos de el indice de masa corporal
fun main(parametro:Array<String>) {

    println("Ingresa tu estatura:")
    val Estatura = readln().toDouble()

    println("Ingresa tu peso:")
    val Peso = readln().toDouble()

    val EstCuadrado = (Estatura * Estatura)

    val Imc = (Peso / EstCuadrado)

    println("Hola tu indice de masa muscular es = " + Imc)

    if (Imc < 18.5){
        print("Tienes bajo peso")
    }

    else if (Imc >= 18.6  && Imc < 24.9){
        print("Tienes peso Saludable")
    }

    else if (Imc >= 25.0  && Imc < 29.9){
        print("Tienes Sobre peso")
    }

    else {
        println("Tienes Obesidad")
    }
}
