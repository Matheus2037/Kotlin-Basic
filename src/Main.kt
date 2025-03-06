package BasicPOO
val listaPessoas: MutableList<Pessoa> = mutableListOf()
val listaAniversariantes: MutableList<Pessoa> = mutableListOf()

fun main(){

    val pessoa1 = Pessoa("João", "Carlos", 20)
    val pessoa2 = Pessoa("Eduardo", "Domingos", 19)
    val pessoa3 = Pessoa("Matheus", "Gastaldi", 20)
    val funcionario1 = Funcionario("João", "Carlos", 20, 2000.0)


    for(pessoa in listaPessoas) {
        if (pessoa is Funcionario) {
            println("Funcionário: ${pessoa.primeiroNome} ${pessoa.segundoNome} - ${pessoa.idade} anos - R$${pessoa.salario}")
        } else {
            println("Pessoa: ${pessoa.primeiroNome} ${pessoa.segundoNome} - ${pessoa.idade} anos")
        }
    }
}