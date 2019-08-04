package KarsilastirmaOperator

fun main(args: Array<String>) {

    var number1 = 14
    var number2 = 7
    var result : Boolean

    // number1, number2 den küçük olmadığı için false döner
    result = number1 < number2
    println("$number1 < $number2 : $result ")

    // number1, number2 den büyük olduğu için true döner
    result = number1 > number2
    println("$number1 > $number2 : $result ")

    // number1, number2 den küçük veya eşit olmadığı için false döner
    result = number1 <= number2
    println("$number1 <= $number2 : $result ")

    // number1, number2 den büyük olduğu için true döner.Eşit değildir.
    result = number1 >= number2
    println("$number1 >= $number2 : $result ")

    // number1, number2 eşit değildir false döner.
    result = number1 == number2
    println("$number1 == $number2 : $result ")

    // number1, number2 eşit olmadığı için true döner.
    result = number1 != number2
    println("$number1 != $number2 : $result ")
}