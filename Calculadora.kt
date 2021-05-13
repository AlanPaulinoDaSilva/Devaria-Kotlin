import java.math.BigDecimal
import java.sql.SQLOutput
fun calculaOperacao(primeiroNumero: BigDecimal, operador: String, segundoOperador: BigDecimal ):BigDecimal{
    when(operador){
        "+"-> return primeiroNumero + segundoOperador
        "-"-> return primeiroNumero - segundoOperador
        "*"-> return primeiroNumero * segundoOperador
        "/"-> return primeiroNumero / segundoOperador
        "%"-> return primeiroNumero % segundoOperador
        else -> return BigDecimal.ZERO

    }
}

fun main() {
    println("Digite um numero valido:")
    val primeiroNumero = readLine()?.toBigDecimalOrNull()

    if (primeiroNumero == null) {
        println("primeiro numero informado não é valido")
        return
    }
    println("Digite um operador valido(+,-,*,/,%)")
    val operador = readLine()
    if (operador.isNullOrEmpty() || operador.isNullOrBlank() ||
        (operador != null && operador != "+" && operador != "-" && operador != "*"
                && operador != "/" && operador != "%")
    ) {
        println("Operador invalido!")
        return
    }
    println("Digite o segundo numero valido:")
    val segundoNumero = readLine()?.toBigDecimalOrNull()

    if (segundoNumero == null) {
        println("Segundo numero informado não é valido")
        return
    }
    val resultado = calculaOperacao(primeiroNumero, operador, segundoNumero)
    println("O resutado de sua operação foi:$resultado")
}