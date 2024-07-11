package com.example.practicas

fun main (parametro: Array<String>) {


    println("Ingresa un número")
    val DiaSemana = readln().toInt()

    when (DiaSemana) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6-> println("Sabado")
        7 -> println("Domingo")
    }

    if (DiaSemana < 3) {
        println("Feliz :( inicio de semana")
    }
    else if (DiaSemana == 3 ) {
        println("Feliz :| ombligo de semana")
    }

    else if (DiaSemana > 4 && DiaSemana <= 7) {
        println("Feliz :) Fin de semana")
    }
    else {
        println("Número de día inexistente")
    }
}