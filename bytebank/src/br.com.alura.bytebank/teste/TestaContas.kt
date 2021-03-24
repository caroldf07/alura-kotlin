import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContas() {
    val contaCorrente = ContaCorrente(Cliente("Carol", "111.111.111-11", Endereco("Rua Vergueiro"), 1), 1001)
    val contaPoupanca = ContaPoupanca(Cliente("Carol", "111.111.111-11", Endereco("Rua Vergueiro"), 1), 1002)

    contaCorrente.deposita(1000.00)
    contaCorrente.saca(500.00)
    println(contaCorrente.saldo)

    contaPoupanca.deposita(3000.00)
    contaPoupanca.saca(500.00)
    println(contaPoupanca.saldo)
}
