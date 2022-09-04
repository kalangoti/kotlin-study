package santo.system.bytebank

import santo.system.bytebank.basic.Account

fun main() {
    // KOTLIN - Conditions and loops: https://kotlinlang.org/docs/control-flow.html
    // KOTLIN for Python developers: https://khan.github.io/kotlin-for-python-developers/#loops

    testCopyObject()
}

fun testCopyObject() {
    val accountJoao = Account("Joao", 1000)

    val accountMaria = accountJoao
    accountMaria.owner = "Maria"
    accountJoao.owner = "Pedro"

    println("accountJoao ${accountJoao.owner}")
    println("accountMaria ${accountMaria.owner}")
    println("-----------")
    testVariablePrimitive()
}

private fun testVariablePrimitive() {
    val numberX = 10
    var numberY = numberX
    numberY++

    println("numberX $numberX")
    println("numberY $numberY")
}
