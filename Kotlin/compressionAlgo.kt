fun main() {
    val sequence = readln().toMutableList()
    var recurrence = 1
    var recurrenceList = mutableListOf<Pair<Char, Int>>()

    for (i in sequence.indices) {
        if (i != sequence.size - 1 && sequence[i] == sequence[i + 1]) {
            recurrence += 1
        } else {
            recurrenceList += sequence[i] to recurrence
            recurrence = 1
        }
    }
    print(recurrenceList.joinToString().replace("(", "").replace(")", "").replace(",", "").replace(" ", ""))
}
