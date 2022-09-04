import santo.system.bytebank.basic.inheritance.Director
import santo.system.bytebank.basic.inheritance.Employee
import santo.system.bytebank.basic.inheritance.Manager

fun main() {
    println("Hello world into Bytebank")

    val anderson = Employee(
        name = "Anderson",
        cpf = "111.111.111-11",
        salary = 1000.0
    )

    println("nome ${anderson.name}")
    println("cpf ${anderson.cpf}")
    println("salario ${anderson.salary}")
    println("bonificacao ${anderson.reward()}")

    println("----------------")
    val fran = Manager(
        name = "Fran",
        cpf = "222.222.222-22",
        salary = 2000.0,
        pass = 1234
    )

    println("nome ${fran.name}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salary}")
    println("bonificação ${fran.reward()}")

    if (fran.auth(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    println("----------------")
    val gui = Director(
        name = "Gui",
        cpf = "333.333.333-33",
        salary = 4000.0,
        pass = 4000,
        plr = 200.0
    )

    println("nome ${gui.name}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salary}")
    println("bonificação ${gui.reward()}")
    println("plr ${gui.plr}")

    if (gui.auth(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }
}

