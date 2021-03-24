fun testaAutenticacao() {
    val gerente = Gerente(
        "Carol",
        "111.111.111-26",
        2000.0,
        1234
    )

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(gerente, 1234)
}
