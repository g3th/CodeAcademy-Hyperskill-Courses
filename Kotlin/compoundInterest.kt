import kotlin.math.*

fun compountInterest(amount: Int = 1000, percent: Int = 5, years: Int = 10) {
    var a = amount
    var p = percent
    var y = years
    val input = readln()
    val num = readln().toInt()
    when {
        input == "amount" -> a = num
        input == "percent" -> p = num
        input == "years" -> y = num
    }
    val result = a * (1 + p / 100.0).pow(y)
    print(result.toInt())
}

fun main() {
    compountInterest()
}
