abstract class Conta(
    val titular: String,
    val numero: Int
) {

    var saldo: Double = 0.0
        protected set

    fun deposita(valor: Double) {
        saldo += valor
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}