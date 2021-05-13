fun main(argumentos: Array<String>) {
//    if(argumentos.isEmpty()){
//        println("Favor informar um argumento valido")
//        return
//    }
    val numero=argumentos[0].toIntOrNull()

    if(numero==null){
        println("O valor informado não é um numero válido")
        return
    }
    println("O numero digitado foi: $numero")
    var soma=0
    soma=numero+numero
    println("A soma de: $numero + $numero é $soma")
}