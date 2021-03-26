package br.com.alura.array

fun main() {
    val serie: IntRange = 1.rangeTo(10)
    for(s in serie){
        //println("$s")
    }

    val numerosPares = 0..100 step 2
    for(numeroPar in numerosPares){
        //println("$numeroPar")
    }

    val numerosParesReversos = 100 downTo 0 step 2
    for(numeroParReverso in numerosParesReversos){
        //println("$numeroParReverso")
    }

    val intervalo = 1500.00..5000.00
    val salario = 4000.0
    if(salario in intervalo){
        //println("Está no intervalo")
    } else {
        //println("Não está no intervalo")
    }


}