fun main() {
    println("Favor informar o nome do convidado")
    val nome= readLine()

    if(nome.isNullOrEmpty()||nome.isNullOrBlank()){
        println("Nome informado não é valido")
        return
    }
    println("Favor informar a idade do convidado:")
    val idade= readLine()?.toIntOrNull()

    if(idade==null || idade<=0){
        println("A idade informada não é valida")
        return
    }
    var estaConvidado=false
    when(nome){
        "Kaike"->estaConvidado=true
        "Alan"->estaConvidado=true
        "Ale"->estaConvidado=true
        "Ricardo"->estaConvidado=true
        "Aldo"->estaConvidado=true
        else->estaConvidado=false
    }
    if(estaConvidado&&idade>=18){
        println("$nome. Bem vindo a festa Kotlin Devaria 2021.")

    }else if(!estaConvidado){
        println("$nome. Você não está convidado, verefique com quem te chamou.")

    }else{
        println("Você não é maior de 18 anos para entrar na festa")
    }

}