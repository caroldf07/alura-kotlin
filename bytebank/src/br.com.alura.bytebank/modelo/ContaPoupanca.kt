package br.com.alura.bytebank.modelo

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun saca(valor: Double) {
        this.saldo -= valor
    }
}