fun main() {
    println("Hello world into Bytebank")

    // KOTLIN - Conditions and loops: https://kotlinlang.org/docs/control-flow.html
    // KOTLIN for Python developers: https://khan.github.io/kotlin-for-python-developers/#loops
    // KOTLIN - Delegated properties: https://kotlinlang.org/docs/properties.html#declaring-properties
    // KOTLIN - Constructors AND initializer blocks: https://kotlinlang.org/docs/classes.html#constructors
    // KOTLIN - Coding conventions: https://kotlinlang.org/docs/coding-conventions.html

    val contaAlex = Conta(titular = "Alex", numero = 1000)
    contaAlex.depositar(200.0)

    val contaFran = Conta(numero = 1001, titular = "Fran")
    contaFran.depositar(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("depositando 50 na conta do Alex")
    contaAlex.depositar(50.0)
    println(contaAlex.saldo)

    println("depositando 70 na conta da Fran")
    contaFran.depositar(70.0)
    println(contaFran.saldo)

    println("sacando 250 na conta do Alex")
    contaAlex.sacar(250.0)
    println(contaAlex.saldo)

    println("sacando 100 na conta da Fran")
    contaFran.sacar(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Alex")
    contaAlex.sacar(100.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.sacar(500.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Alex")

    if (contaFran.transferir(value = 300.0, contaDestino = contaAlex)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}

class Conta(
    var titular: String,
    val numero: Int = 0
) {

//    constructor(titular: String, numero: Int) {
//        this.titular = titular
//        this.numero = numero
//    }

    var saldo: Double = 0.0
        private set
//        set(value) {
//            if (value > 0) {
//                field = value
//            }
//        }

    fun depositar(value: Double) {
        if (value > 0) {
            this.saldo += value
        }
    }

    fun sacar(value: Double) {
        if (saldo >= value) {
            this.saldo -= value
        }
    }

    fun transferir(value: Double, contaDestino: Conta): Boolean {
        if (saldo >= value) {
            this.saldo -= value
            contaDestino.depositar(value)
            return true
        }
        return false
    }

//    fun getSaldo(): Double {
//        return this.saldo
//    }
//
//    fun setSaldo(value: Double) {
//        if (value > 0) {
//            this.saldo = value
//        }
//    }
}

fun testCopyObject() {
    val contaJoao = Conta("Joao", 1000)
    contaJoao.depositar(200.0)

    val contaMaria = contaJoao
    contaMaria.titular = "Maria"
    contaJoao.titular = "Pedro"

    println("contaJoao ${contaJoao.titular}")
    println("contaMaria ${contaMaria.titular}")
    testVariablePrimitive()
}

fun testVariablePrimitive() {
    val numberX = 10
    var numberY = numberX
    numberY++

    println("numberX $numberX")
    println("numberY $numberY")
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
