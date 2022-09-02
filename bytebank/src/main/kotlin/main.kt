fun main() {
    println("Hello world into Bytebank")

    val titular = "Anderson"
    val numeroConta = 1000
    var saldo = 0.0
    saldo = 100 + 2.0
    saldo += 200
    saldo -= 1000

    println("Titular $titular")
    println("Número da Conta $numeroConta")
    println("Saldo da conta $saldo")

    // KOTLIN - Conditions and loops: https://kotlinlang.org/docs/control-flow.html
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }

    when {
        saldo > 0.0 -> println("A conta é positiva")
        saldo == 0.0 -> {
            println("A conta é neutra")
        }

        else -> println("A conta é negativa")
    }
}
