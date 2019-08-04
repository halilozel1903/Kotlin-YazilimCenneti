package AtamaOperator

fun main(args: Array<String>) {

    var num1 : Float = 11f
    var num2 : Float = 4f

    num2 += num1 // num2 = num2 + num1
    println("num2 : $num2")

    num2 -= num1 // num2 = num2 - num1
    println("num2 : $num2")

    num2 *= num1 // num2 = num2 * num1
    println("num2 : $num2")

    num2 /= num1 // num2 = num2 / num1
    println("num2 : $num2")

    num2 %= num1 // num2 = num2 % num1
    println("num2 : $num2")
}