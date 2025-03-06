package BasicPOO
//val listaPessoasOLD: MutableList<Pessoa> = mutableListOf()
//val listaAniversariantesOLD: MutableList<Pessoa> = mutableListOf()
//
//class PessoaOLD(var primeiroNome: String, var segundoNome: String, var idade: Int){
//    init{
//        println("Pessoa criada com sucesso!")
//    }
//    fun Aniversario(){
//        idade++
//    }
//}
//
//fun main(){
//    val pessoa1 = PessoaOLD("João", "Carlos", 20)
//    val pessoa2 = PessoaOLD("Eduardo", "Domingos", 19)
//    val pessoa3 = PessoaOLD("Matheus", "Gastaldi", 20)
//    listaPessoasOLD.add(pessoa1)
//    listaPessoasOLD.add(pessoa2)
//    listaPessoasOLD.add(pessoa3)
//
//    listaAniversariantesOLD.add(pessoa3)
//
//    for(pessoa in listaPessoasOLD){
//        if(pessoa in listaAniversariantesOLD){
//            println("Parabéns ${pessoa.primeiroNome} ${pessoa.segundoNome} pelo seu aniversário! Feliz, ${pessoa.idade} anos!")
//        } else
//            println("Nome: ${pessoa.primeiroNome} ${pessoa.segundoNome}, Idade: ${pessoa.idade}")
//    }
//}