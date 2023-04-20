fun main() {
    val numOfElements = readln().toInt()
    val listOfNums = mutableListOf<Int>()

    repeat(numOfElements) {
        val num = readln().toInt()
        listOfNums.add(num)
    }

    val lastIndex = listOfNums.lastIndex + 1
    val newList = mutableListOf<Int>()
    val numberOfPositions = readln().toInt() % numOfElements
    for (i in lastIndex - numberOfPositions until lastIndex) {
        newList.add(listOfNums[i])
    }

    listOfNums.retainAll { it !in newList }
    newList.addAll(numberOfPositions, listOfNums)
    newList.forEach {
        print("$it ")
    }
}
