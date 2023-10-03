fun main() {
    val firstMoment = mutableListOf<Int>()
    val secondMoment = mutableListOf<Int>()
    var firstResult: Int
    var secondResult: Int
    repeat(6) {
        val input = readln().toInt()
        if (it < 3) {
            firstMoment.add(input)
        } else {
            secondMoment.add(input)
        }
    }

    firstResult = (firstMoment[0] * 60 + firstMoment[1]) * 60 + firstMoment[2]
    secondResult = (secondMoment[0] * 60 + secondMoment[1]) * 60 + secondMoment[2]
    println(secondResult - firstResult)
}
