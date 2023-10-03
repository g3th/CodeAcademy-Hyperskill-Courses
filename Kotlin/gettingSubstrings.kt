fun main() {
    val input = readln().toCharArray()
    for (i in input.size - 1 downTo 0) {
        if (input[i] == 'u') {
            for (j in i + 1 until input.size) {
                input[j] = input[j].uppercaseChar()
            }
            break
        }
    }
    println(input)
}
