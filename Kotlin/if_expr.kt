fun dividedBy(num: Int) {
    val divisors = listOf(2, 3, 5, 6)
    val result = mutableListOf<String>()
    for (i in divisors) {
        val tempResult = num % i
        if (tempResult == 0) {
            result.add("Divided by ${i}")
        }
    }
    result.forEach {
        println(it)
    }
}

fun main() {
    val input = readln().toInt()
    dividedBy(input)
}
