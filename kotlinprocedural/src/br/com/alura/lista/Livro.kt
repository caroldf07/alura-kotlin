package br.com.alura.lista

data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null
) {
    var menorNumero: Int = Int.MAX_VALUE
}