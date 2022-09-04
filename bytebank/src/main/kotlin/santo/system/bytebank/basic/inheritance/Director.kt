package santo.system.bytebank.basic.inheritance

class Director(
    name: String,
    cpf: String,
    salary: Double,
    val pass: Int,
    val plr: Double
) : Employee(
    name = name,
    cpf = cpf,
    salary = salary
) {
    override fun reward(): Double {
        return salary * 0.2
    }

    fun auth(pass: Int): Boolean {
        if (this.pass == pass) {
            return true
        }
        return false
    }
}
