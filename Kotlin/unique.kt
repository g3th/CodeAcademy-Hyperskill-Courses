fun main() {
    val string = readln()
    val counter = 0
    var unique = string
    for (i in string.indices) {
        for (j in unique.indices) {
            if (string[i] == unique[j] && i != j) {
                unique = unique.replace(unique[j], ' ')
            }
        }
    }
    unique = unique.replace(" ", "")
    println(unique.length)
}
