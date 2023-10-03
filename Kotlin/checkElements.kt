fun main() {
    val nums = mutableListOf<Int>()
    val arraySize = readln().toInt()
    repeat(arraySize) {
        val input = readln().toInt()
        nums.add(input)
    }
    val input = readln().split(" ").map { it.toInt() }
    val noDuplicates = nums.distinct()
    if (input.intersect(noDuplicates).size == 2) {
        println("YES")
    } else {
        println("NO")
    }
}
