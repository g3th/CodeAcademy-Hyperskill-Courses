fun main() {
    val storePreviousChar = mutableListOf<Char>()
    repeat(4) {
        val input = readln().single()
        storePreviousChar.add(input - 1)
    }
    storePreviousChar.forEach {
        println(it)
    }
}
