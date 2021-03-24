fun testaComportamentosConta(): Conta {
    val contaCarol = ContaCorrente("Carol", 1000)

    val contaTay = ContaCorrente("Tay", 1001)

    println(contaCarol.titular)
    println(contaCarol.numero)
    println(contaCarol.saldo)

    contaCarol.deposita(200.00)
    println("Novo saldo Carol: ${contaCarol.saldo}")
    contaCarol.saca(50.00)
    println("Novo saldo Carol: ${contaCarol.saldo}")

    contaTay.transfere(500.00, contaCarol)
    println("Novo saldo Carol: ${contaCarol.saldo}")
    println("Novo saldo Tay: ${contaTay.saldo}")
    return contaCarol
}
