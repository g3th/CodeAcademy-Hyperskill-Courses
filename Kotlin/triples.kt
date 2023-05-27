fun main() {
    val n = readln().toInt()
    val nlist = mutableListOf<Int>()
    var numberOfTriples = 0
    repeat(n) {
        val input = readln().toInt()
        nlist.add(input)
    }
    for (i in nlist.indices) {
        if (i + 2 <= nlist.size - 1 && nlist[i] + 1 == nlist[i + 1] && nlist[i + 1] + 1 == nlist[i + 2]) {
            numberOfTriples++
        }
    }
    println(numberOfTriples)
}
