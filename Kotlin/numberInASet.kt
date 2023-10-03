import kotlin.system.exitProcess

fun main() {
    val num = readln().toInt()
    val numList = mutableListOf<Int>()
    repeat(num) {
        numList.add(readln().toInt())
    }
    val numNeeded = readln().toInt()
    for (i in numList.indices) {
        if (i + 1 < numList.size && numList[i + 1] == numNeeded) {
            println("YES")
            exitProcess(0)
        }
    }
    for (i in numList.size downTo 0) {
        if (i - 1 >= 0 && numList[i - 1] == numNeeded) {
            println("YES")
            exitProcess(0)
        }
    }
    println("NO")
}
