package br.com.alura.bytebank.modelo

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    override fun toString(): String {
        return "br.com.alura.bytebank.modelo.Funcionario(nome='$nome', cpf='$cpf', salario=$salario)"
    }

    abstract val bonificacao: Double

}