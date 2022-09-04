package santo.system.bytebank.basic

class Account(
    var owner: String,
    val number: Int = 0
) {

//    constructor(owner: String, number: Int) {
//        this.owner = owner
//        this.number = number
//    }

    var balance: Double = 0.0
        private set
//        set(value) {
//            if (value > 0) {
//                field = value
//            }
//        }

    fun deposit(value: Double) {
        if (value > 0) {
            this.balance += value
        }
    }

    fun withdraw(value: Double) {
        if (balance >= value) {
            this.balance -= value
        }
    }

    fun transfer(value: Double, accountDestiny: Account): Boolean {
        if (balance >= value) {
            this.balance -= value
            accountDestiny.deposit(value)
            return true
        }
        return false
    }

//    fun getBalance(): Double {
//        return this.balance
//    }
//
//    fun setBalance(value: Double) {
//        if (value > 0) {
//            this.balance = value
//        }
//    }
}
