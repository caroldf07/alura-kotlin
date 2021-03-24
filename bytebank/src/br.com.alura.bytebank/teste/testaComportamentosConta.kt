import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Conta
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.Endereco

fun testaComportamentosConta(): Conta {
    val contaCarol = ContaCorrente(Cliente("Carol","111.111.111-11", Endereco("Rua Vergueiro"),1), 1000)

    val contaTay = ContaCorrente(Cliente("Tay","111.111.111-11",Endereco("Rua Vergueiro"),2), 1001)

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
