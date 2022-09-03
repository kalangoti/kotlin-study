fun main() {
    println("Hello world into Bytebank")

    // KOTLIN - Conditions and loops: https://kotlinlang.org/docs/control-flow.html
    // Kotlin for Python developers: https://khan.github.io/kotlin-for-python-developers/#loops

}

class Conta() {
    val titular: String = ""
    val numero: Int = 0
    val saldo: Double = 0.0

}

fun testConditions(saldo: Double) {
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

fun testLoops() {
    // cria 5 contas
    println("You can create a range with the .. operator")
    for (i in 1..5) {
        val titular = "Anderson $i"
        val numeroConta = 1000 + i
        val saldo = i + 10.0

        println("Titular $titular")
        println("Número da Conta $numeroConta")
        println("Saldo da conta $saldo")
        println("----------")
    }

    println("If you need to count downwards, use the inclusive downTo")
    println("continue skips to the next iteration of the innermost containing loop, and break stops the loop")
    for (i in 5 downTo 1) {
        if (i == 4) {
            continue
        }
        if (i <= 1) {
            break
        }
        println(i)
    }
    println("----------")

    // cria 3 contas de 2 em 2
    println("You can control the increment with step")
    for (i in 1..5 step 2) {
        val titular = "Anderson $i"
        val numeroConta = 1000 + i
        val saldo = i + 10.0

        println("Titular $titular")
        println("Número da Conta $numeroConta")
        println("Saldo da conta $saldo")
        println("----------")
    }

    // cria apenas 4 contas do 1 até 4
    println("If you want to exclude the last value, use until")
    for (i in 1 until 5) {
        val titular = "Anderson $i"
        val numeroConta = 1000 + i
        val saldo = i + 10.0

        println("Titular $titular")
        println("Número da Conta $numeroConta")
        println("Saldo da conta $saldo")
        println("----------")
    }
}

fun testWhile() {
    var i = 0
    var j = 1
    while (i < 5) {
        println("i: $i")
        i++
    }
    println("----------")
    do {
        println("j: $j")
        j++
    } while (j < 5) // variable is visible here!
}
