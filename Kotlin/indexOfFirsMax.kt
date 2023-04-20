fun main() {
    val numOfElements = readln().toInt()
    val elementList = mutableListOf<Int>()
    var storedValue = 0

    repeat(numOfElements) {
        val element = readln().toInt()
        elementList.add(element)
    }

    for (i in elementList) {
        if (i > storedValue) {
            storedValue = i
        }
    }
    println("${elementList.indexOf(storedValue)}")
}
