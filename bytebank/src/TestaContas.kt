fun testaContas() {
    val contaCorrente = ContaCorrente("Carol", 1001)
    val contaPoupanca = ContaPoupanca("Carol", 1002)

    contaCorrente.deposita(1000.00)
    contaCorrente.saca(500.00)
    println(contaCorrente.saldo)

    contaPoupanca.deposita(3000.00)
    contaPoupanca.saca(500.00)
    println(contaPoupanca.saldo)
}
