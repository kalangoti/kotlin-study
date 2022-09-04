package santo.system.bytebank.basic.inheritance

open class Employee(
    val name: String,
    val cpf: String,
    val salary: Double
) {
    open fun reward(): Double {
        return salary * 0.1
    }
}
