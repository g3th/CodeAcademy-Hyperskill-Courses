import kotlin.math.abs

@Suppress("MagicNumber")
fun main() {
    var input = readln().toInt()
    if (input < 0) {
        input = abs(input)
    }
    val result = input % 100 / 10
    print(result)
}
