package santo.system.bytebank.basic.oo

fun main() {
    // KOTLIN - Conditions and loops: https://kotlinlang.org/docs/control-flow.html
    // KOTLIN for Python developers: https://khan.github.io/kotlin-for-python-developers/#loops

    testWhile()
    testLoops()
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

fun testLoops() {
    // cria 5 contas
    println("You can create a range with the .. operator")
    for (i in 1..5) {
        val owner = "Anderson $i"
        val accountNumber = 1000 + i
        val balance = i + 10.0

        println("Titular $owner")
        println("Número da Conta $accountNumber")
        println("Saldo da conta $balance")
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
        val owner = "Anderson $i"
        val accountNumber = 1000 + i
        val balance = i + 10.0

        println("Titular $owner")
        println("Número da Conta $accountNumber")
        println("Saldo da conta $balance")
        println("----------")
    }

    // cria apenas 4 contas do 1 até 4
    println("If you want to exclude the last value, use until")
    for (i in 1 until 5) {
        val owner = "Anderson $i"
        val accountNumber = 1000 + i
        val balance = i + 10.0

        println("Titular $owner")
        println("Número da Conta $accountNumber")
        println("Saldo da conta $balance")
        println("----------")
    }
}
