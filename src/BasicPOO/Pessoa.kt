package BasicPOO

open class Pessoa(val primeiroNome: String, val segundoNome: String, var idade: Int){
    init{
        println("Pessoa criada com sucesso!")
        listaPessoas.add(this)
    }
    fun Aniversario(){
        idade++
    }
}