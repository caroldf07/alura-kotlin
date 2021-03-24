class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(
    nome,
    cpf,
    salario,
    senha
) {
    override fun toString(): String {
        return super.toString() + "Gerente(senha=$senha, bonificacao=$bonificacao)"
    }

    override val bonificacao: Double = salario * 0.2


}