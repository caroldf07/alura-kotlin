fun testaCondições(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta positiva")
        saldo == 0.0 -> println("Conta zerada")
        else -> print("Conta negativa")
    }
}