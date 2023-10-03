fun main() {
    val alphabet = ('a'..'z').joinToString().reversed()
    val query = readln()
    println(alphabet.substring(alphabet.indexOf(query) + 1).reversed().replace(",", "").replace(" ", ""))
}
