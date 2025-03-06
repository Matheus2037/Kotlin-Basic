package BasicPOO

class Funcionario(primeiroNome: String, segundoNome: String, idade: Int, var salario: Double) : Pessoa(primeiroNome, segundoNome, idade){
    init{
        println("Funcionário criado com sucesso!")
    }
}
