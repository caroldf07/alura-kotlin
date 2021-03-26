package br.com.alura.array

fun main() {
    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55,5)

    var maiorIdade: Int = 0

    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println(maiorIdade)

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }

    println(menorIdade)

    val salarios: DoubleArray = doubleArrayOf(1550.50,2300.80,5000.00,15300.00)

    for(indice in salarios.indices){
        salarios[indice] *= 1.1
    }

    println(salarios.contentToString())

    salarios.forEachIndexed { i, salario ->
        salarios[i] *= 1.1
    }

    println(salarios.contentToString())
}