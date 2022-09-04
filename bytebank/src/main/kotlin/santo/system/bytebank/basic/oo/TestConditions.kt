package santo.system.bytebank.basic.oo

fun main() {
    // KOTLIN - Conditions and loops: https://kotlinlang.org/docs/control-flow.html
    // KOTLIN for Python developers: https://khan.github.io/kotlin-for-python-developers/#loops

    testConditions(0.0)
}

fun testConditions(balance: Double) {
    if (balance > 0.0) {
        println("conta é positiva")
    } else if (balance == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }

    when {
        balance > 0.0 -> println("A conta é positiva")
        balance == 0.0 -> {
            println("A conta é neutra")
        }

        else -> println("A conta é negativa")
    }
}
