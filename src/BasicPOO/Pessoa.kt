package BasicPOO
val listaPessoas: MutableList<Pessoa> = mutableListOf()
val listaAniversariantes: MutableList<Pessoa> = mutableListOf()

class Pessoa(var primeiroNome: String, var segundoNome: String, var idade: Int){
    init{
        println("Pessoa criada com sucesso!")
    }
    fun Aniversario(){
        idade++
    }
}

fun main(){
    val pessoa1 = Pessoa("João", "Carlos", 20)
    val pessoa2 = Pessoa("Eduardo", "Domingos", 19)
    val pessoa3 = Pessoa("Matheus", "Gastaldi", 20)
    listaPessoas.add(pessoa1)
    listaPessoas.add(pessoa2)
    listaPessoas.add(pessoa3)

    listaAniversariantes.add(pessoa3)

    for(pessoa in listaPessoas){
        if(pessoa in listaAniversariantes){
            println("Parabéns ${pessoa.primeiroNome} ${pessoa.segundoNome} pelo seu aniversário! Feliz, ${pessoa.idade} anos!")
        } else
            println("Nome: ${pessoa.primeiroNome} ${pessoa.segundoNome}, Idade: ${pessoa.idade}")
    }
}