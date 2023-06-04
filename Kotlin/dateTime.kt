import kotlinx.datetime.*

fun isLeapYear(year: String): Boolean {
    // Write your code here
    try {
        Instant.parse("$year-02-29T20:00:00Z")
    } catch (e: Exception) {
        return false
    }
    //
    return true
}

fun main() {
    val year = readln()
    println(isLeapYear(year))
}
