package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.FuncionarioAdmin

class SistemaInterno {

    fun entra(admin: FuncionarioAdmin, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }
    }
}