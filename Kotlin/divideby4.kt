fun main(){
    val numberOfElements = readln().toInt()
    val sequence = mutableListOf<Int>()
    val newList = mutableListOf<Int>()
    var storedNum = 0

    repeat(numberOfElements){
        val elementsThemselves = readln().toInt()
        sequence.add(elementsThemselves)
    }

    sequence.forEach {
        if (it % 4 == 0) {
            newList.add(it)
        }
    }

    newList.forEach(){
        if (it == newList.indexOf(0)){
            storedNum = it
        } else {
            if (storedNum <= it){
                storedNum = it
            }
        }
    }

    println(storedNum)
}
