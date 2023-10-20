var top = 0

fun p(n: Int): Int {
    print(n)
    top++
    return top
}

fun main() {
    var counter = 0
    val input = readln().trim().toInt()
    while (counter <= input) {
        repeat(counter) {
            val n = p(counter)
            if (n == input) {
                return
            }
            print(" ")
        }
        counter++
    }
}
