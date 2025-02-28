package BasicEX
private val filaPacientes: ArrayDeque<String> = ArrayDeque()
val pacientesAtendidos: MutableList<String> = mutableListOf()



fun main(){
    while(true){
        println(""" 
                    #### GERENCIAMENTO DE ATENDIMENTO ####
                    1 - Adicionar paciente
                    2 - Atender paciente
                    3 - Ver lista de pacientes
                    4 - Atendimentos finalizados
                    5 - Finalizar
                    
                    Escolha sua opção: 
                    """.trimIndent())

        when(readLine()?.toIntOrNull()){
            1 -> {
                print("Nome do paciente: ")
                val nome = readLine().orEmpty()
                if (nome.isNotBlank()){
                    addListaPaciente(nome)
                }else{
                    println("Nome do paciente digitado é invalido! \n")
                    aguardarEnter()
                }
            }
            2 -> {
                if (filaPacientes.isNotEmpty()){
                    val nometemp = filaPacientes[0]
                    println("Cliente $nometemp, foi atendido!")
                    delListaPaciente()
                    aguardarEnter()
                }else{
                    println("Nenhum paciente para atender! \n")
                    aguardarEnter()
                }
            }
            3 -> {
                if(filaPacientes.isNotEmpty()){
                    println("Listagem de pacientes aguardando: $filaPacientes \n")
                    aguardarEnter()
                }else if(pacientesAtendidos.isNotEmpty()){
                    println("Todos os pacientes foram atendidos até o presente momento! \n")
                    aguardarEnter()
                }else{
                    println("Nenhum paciente aguardando atendimento! \n")
                    aguardarEnter()
                }
            }
            4 -> {
                if(pacientesAtendidos.isNotEmpty()){
                    println("Listagem de pacientes atendidos hoje: $pacientesAtendidos \n")
                    aguardarEnter()
                }else{
                    println("Nenhum paciente atendido hoje! \n")
                    aguardarEnter()
                }
            }
            5 -> {
                if(filaPacientes.isNotEmpty()){
                    println("Não foi possivel encerrar o sistema, existem pacientes aguardando atendimento! \n")
                    aguardarEnter()
                }else{
                    println("#### ENCERRANDO SISTEMA #### \n")
                    if (pacientesAtendidos.isNotEmpty()){
                        println("Pacientes Atendidos hoje: $pacientesAtendidos")
                        break
                    }else{
                        println("Não teve nenhum atendimento hoje! ")
                        break
                    }
                }
            }
        }

    }
}

fun addListaPaciente(nomePaciente: String){
    filaPacientes.add(nomePaciente)
}
fun delListaPaciente(){
    filaPacientes.removeFirstOrNull()?.let { nome ->
        pacientesAtendidos.add(nome)
    }
}
fun aguardarEnter(){
    println("Aperte ENTER para continuar")
    readLine().orEmpty()
}