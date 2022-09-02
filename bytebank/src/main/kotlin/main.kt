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
    
    when {
        saldo > 0.0 -> println("A conta é positiva")
        saldo == 0.0 -> {
            println("A conta é neutra")
        }
        else -> println("A conta é negativa")
    }
}
