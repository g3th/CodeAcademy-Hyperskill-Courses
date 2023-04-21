fun pairConversion(numList: List<Int>, pair: MutableList<String>): List<String> {
    for (i in 0 until numList.size step 1) {
        if (i == numList.size - 1) {
            pair.add(numList[i].toString())
            break
        }
        pair.add("${numList[i]} ${numList[i + 1]}")
    }
    return pair
}

fun reversePairConversion(numList: List<Int>, reversedPair: MutableList<String>): List<String> {
    for (i in numList.size - 1 downTo 0 step 1) {
        if (i == 0) {
            reversedPair.add(numList[i].toString())
            break
        }
        reversedPair.add("${numList[i]} ${numList[i - 1]}")
    }
    return reversedPair
}

fun main() {
    val listSize = readln().toInt()
    val numList = mutableListOf<Int>() // 1 2 3 4 5
    val pair = mutableListOf<String>()
    val reversedPair = mutableListOf<String>()

    var result = ""
    repeat(listSize) {
        val numInput = readln().toInt()
        numList.add(numInput)
    }

    val userInputtedElements = readln().split(" ").toMutableList().map { it.toInt() }
    val recurringElements = userInputtedElements.joinToString(" ")
    
    pairConversion(numList, pair)
    reversePairConversion(numList, reversedPair)
    
    // This is the normal list comparison
    for (i in 0 until pair.size) {
        if (pair[i] == recurringElements || pair[i] == recurringElements.reversed()) {
            result = "NO"
            break
        } else if (i == pair.size - 1) {
            result = "YES"
        }
    }
    // This is the reverse comparison
    for (i in 0 until reversedPair.size) {
        if (reversedPair[i] == recurringElements.reversed() || reversedPair[i] == recurringElements) {
            result = "NO"
            break
        } else if (i == reversedPair.size - 1) {
            result = "YES"
        }
    }
    print(result)
}
