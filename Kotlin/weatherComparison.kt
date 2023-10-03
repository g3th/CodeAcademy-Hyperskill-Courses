class City(var name: String = "") {
    var degrees: Int = 0
        set(value) {
            field = value
            if (field < -92 || field > 57) {
                when (name) {
                    "Moscow" -> field = 5
                    "Dubai" -> field = 30
                    "Hanoi" -> field = 20
                }
            }
        }
    fun getCity(a: Int, b: Int, c: Int, first: String, second: String, third: String): String? {
        val valueList = mutableListOf(a,b,c)
        val temps = mutableMapOf(a to first, b to second, c to third)
        if(a == b || b == c || a == c){
            return "neither"
        }
        return temps[valueList.minOrNull()]
    }
}

fun main() {
    val cities = City()
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    //implement comparing here
    println(cities.getCity(firstCity.degrees, secondCity.degrees, thirdCity.degrees, "Dubai", "Moscow", "Hanoi"))
}
