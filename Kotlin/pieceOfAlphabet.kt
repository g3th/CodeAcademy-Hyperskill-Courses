fun main() {
    var flag = false
    var alphabet = ""
    for (i in 'a'..'z') {
        alphabet += i
    }
    val input = readln()
    val comparison = alphabet.split(input.lowercase().first() - 1, input.lowercase().last() + 1)
    for (i in comparison.indices) {
        if (comparison[i] == input) {
            flag = true
        }
    }
    println(flag)
}
