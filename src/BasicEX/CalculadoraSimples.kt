package BasicEX

private var num1: Int = 0
private var num2: Int = 0

private var menu = 0


fun main() {
    while(true){
        if (menu == 0) {
            println("\nDigite um número: ")
            num1 = readln().toInt()
            println("\nDigite mais um número: ")
            num2 = readln().toInt()
            menu = 1
        }
        else if(menu == 1) {
            println(
                "\nEscolha qual operação matematica gostaria de fazer: " +
                        "\n1 = Somar" +
                        "\n2 = Multiplicação" +
                        "\n3 = Divisão" +
                        "\n4 = Subtração" +
                        "\n5 = Trocar número" +
                        "\n6 = Sair"
            )
            val operacao = readLine()?.toIntOrNull()

            if (operacao == 1) {
                print("O resultado da soma: $num1 + $num2 é igual a " + soma(num1, num2))
            } else if (operacao == 2) {
                print("O resultado da multiplicação: $num1 * $num2 é igual a " + multi(num1, num2))
            } else if (operacao == 3) {
                print("O resultado da divisão: $num1 / $num2 é igual a " + divisao(num1, num2))
            } else if (operacao == 4) {
                print("O resultado da subtração: $num1 - $num2 é igual a " + subtra(num1, num2))
            } else if (operacao == 5) {
                menu = 0
            } else {
                menu = 0
                break
            }
        }
        else{
            menu = 0
            break
        }
    }
}


fun soma(a: Int, b: Int): Int {
    return a + b
}

fun multi(a: Int, b: Int): Int{
    return a * b
}

fun divisao(a: Int, b: Int): Int{
    return a / b
}

fun subtra(a: Int, b: Int): Int{
    return a - b
}