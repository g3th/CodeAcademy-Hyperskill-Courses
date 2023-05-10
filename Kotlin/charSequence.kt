fun main(){
    val input = readln()
    var newString = ""
    for (i in input.indices){
        if (i % 2 != 0){
            newString += ""
        } else {
            newString += input[i]
        }
    }
    println(newString.toCharArray())
}
