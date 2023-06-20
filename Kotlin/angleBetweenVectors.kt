fun main() {
    val v = mutableListOf<Double>()
    repeat(2) {
        val input = readln().split(" ").map { it.toDouble() }
        for (i in input){
            v.add(i)
        }
    }
    val angle = (v[0] * v[2] + v[1] * v[3]) / (sqrt(v[0].pow(2) + v[1].pow(2)) * sqrt(v[2].pow(2) + v[3].pow(2)))
    val answer = acos(angle) / PI * 180
    println(answer)
}
