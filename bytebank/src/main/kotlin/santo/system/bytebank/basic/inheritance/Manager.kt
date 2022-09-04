package santo.system.bytebank.basic.inheritance

class Manager(
    name: String,
    cpf: String,
    salary: Double,
    val pass: Int
) : Employee(
    name = name,
    cpf = cpf,
    salary = salary
) {
    override fun reward(): Double {
        return salary * 0.3
    }

    fun auth(pass: Int): Boolean {
        if (this.pass == pass) {
            return true
        }
        return false
    }
}
