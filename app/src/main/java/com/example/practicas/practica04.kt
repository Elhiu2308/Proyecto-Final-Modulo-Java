package com.example.practicas

//Programa que nos diga si podemos votar
fun main() {

    val Edad = 10

    if  (Edad < 16 ){
        print("No cumples aun con la edad para poder VOTAR")
    }

    else if (Edad >= 18 && Edad < 40){
        print("Vota con conciencia")
    }

    else if (Edad > 16 && Edad <= 17){
        print("Te falta un año para VOTAR")
    }

    else if (Edad <= 10 ){
        print("Eres muy pequeñ@ para VOTAR")
    }

    else {
        println("SI PUEDES VOTAR")
    }

}