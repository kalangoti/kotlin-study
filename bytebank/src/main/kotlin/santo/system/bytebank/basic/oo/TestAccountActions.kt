package santo.system.bytebank.basic.oo

import santo.system.bytebank.basic.Account

fun main() {
    // KOTLIN - Conditions and loops: https://kotlinlang.org/docs/control-flow.html
    // KOTLIN for Python developers: https://khan.github.io/kotlin-for-python-developers/#loops
    // KOTLIN - Delegated properties: https://kotlinlang.org/docs/properties.html#declaring-properties
    // KOTLIN - Constructors AND initializer blocks: https://kotlinlang.org/docs/classes.html#constructors
    // KOTLIN - Coding conventions: https://kotlinlang.org/docs/coding-conventions.html

    testAccountActions()
}

fun testAccountActions() {
    val accountAlex = Account(owner = "Alex", number = 1000)
    accountAlex.deposit(200.0)

    val accountFran = Account(number = 1001, owner = "Fran")
    accountFran.deposit(300.0)

    println(accountFran.owner)
    println(accountFran.number)
    println(accountFran.balance)

    println(accountAlex.owner)
    println(accountAlex.number)
    println(accountAlex.balance)

    println("depositando 50 na conta do Alex")
    accountAlex.deposit(50.0)
    println(accountAlex.balance)

    println("depositando 70 na conta da Fran")
    accountFran.deposit(70.0)
    println(accountFran.balance)

    println("sacando 250 na conta do Alex")
    accountAlex.withdraw(250.0)
    println(accountAlex.balance)

    println("sacando 100 na conta da Fran")
    accountFran.withdraw(100.0)
    println(accountFran.balance)

    println("saque em excesso na conta do Alex")
    accountAlex.withdraw(100.0)
    println(accountAlex.balance)

    println("saque em excesso na conta da Fran")
    accountFran.withdraw(500.0)
    println(accountFran.balance)

    println("Transferência da conta da Fran para o Alex")

    if (accountFran.transfer(value = 300.0, accountDestiny = accountAlex)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(accountAlex.balance)
    println(accountFran.balance)
}
