package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Funcionario

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
): Funcionario(
    nome,
    cpf,
    salario
) {
    override fun toString(): String {
        return "br.com.alura.bytebank.modelo.Funcionario(nome='$nome', cpf='$cpf', salario=$salario)"
    }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}