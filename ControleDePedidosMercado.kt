/* ->Escrever um programa que recebe alguns produtos como argumento,OK
     validar se esses produtos estão na lista de itens disponíveis do mercado.OK

   ->Caso estejam, avisar o usuário quais produtos tem e quais não tem OK

    ->por último, exibir a lista de produtos disponíveis ordenados por ordem alfabética
      do mercado, para que o usuário possa pedir na próxima vez.OK
*/
fun main(argumentos: Array<String>) {

    //validar se vieram produtos dos argumentos
    if (argumentos.isEmpty()) {
        println("Favor informar sua lista de produtos para verificarmos a disponibilidade")
        return
    }
    val produtosDisponiveis = arrayOf(
        "Pão", "Bolacha", "Queijo", "Arroz", "Feijão", "Ovo", "Frango",
        "Azeite", "Óleo"
    )

    val produtosRequisitadosDisponiveis = argumentos.filter { produtoRequisitado ->
        produtosDisponiveis.contains(produtoRequisitado)
    }

    for (produtosRequisitadoDisponivel in produtosRequisitadosDisponiveis) {
        println("Este produto nós temos: $produtosRequisitadoDisponivel")
    }
    val produtosRequisitadosNaoDisponiveis = argumentos.filter { produtoRequisitado ->
        !produtosDisponiveis.contains(produtoRequisitado)
    }
    produtosRequisitadosNaoDisponiveis.forEach { produtoNaoDisponivel ->
        println("Este produto nós não temos infelismente: $produtoNaoDisponivel")
    }
     val produtosOrdenados=produtosDisponiveis.sortedBy { produto -> produto }
     produtosOrdenados.forEach { produto -> println("Confira estes produtos disponiveis: $produto") }
}
