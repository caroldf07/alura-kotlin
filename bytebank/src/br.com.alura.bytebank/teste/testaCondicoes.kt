fun testaCondições(saldo: Double) {
    when {
        saldo > 0.0 -> println("br.com.alura.bytebank.modelo.Conta positiva")
        saldo == 0.0 -> println("br.com.alura.bytebank.modelo.Conta zerada")
        else -> print("br.com.alura.bytebank.modelo.Conta negativa")
    }
}