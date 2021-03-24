import br.com.alura.bytebank.modelo.CalculadoraBonificacao
import br.com.alura.bytebank.modelo.Gerente

fun testaFuncionarios() {
    val contaCarol = testaComportamentosConta()

    testaCondições(contaCarol.saldo)

    val tay = Gerente(
        "Tay",
        "111.111.111-11",
        1000.0,
        12134
    )

    println("Tay: ${tay.toString()}")
    println("Bonificação: ${tay.bonificacao}")

    val tayGerente = Gerente(
        "Tay",
        "111.111.111-11",
        2000.0,
        1234
    )

    println("Tay: ${tayGerente.toString()}")
    println("TayGerente bonificacao: ${tayGerente.bonificacao}")

    val calculadoraBonificacao = CalculadoraBonificacao()
    calculadoraBonificacao.registra(tay)
    calculadoraBonificacao.registra(tayGerente)
    println("Total: ${calculadoraBonificacao.total}")
}
