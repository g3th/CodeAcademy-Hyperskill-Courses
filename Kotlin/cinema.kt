package cinema

fun printCinemaRoom(){
    println("Cinema:")
    for (i in 0..8){
        if (i < 1){
            print ("  ")
        }
        else if (i == 8){
            print ("${i}")
        }
        else {
            print ("${i} ")
        }
    }
    for (i in 1..7){
        print("\n${i} ")
        for (i in 1..8){
            print("S ")
            if (i == 7){
                print("S")
                break
            }
        }
    }
}

fun round(num: Int) : List<Int> {
    var doubleValue : Double = num.toDouble() / 2
    var firstNum : Int
    val result = mutableListOf<Int>()

    if (doubleValue % 1 >= 0.5){
        firstNum = (doubleValue + 1).toInt()
        result.add(firstNum)
        result.add(num - firstNum)
    }
    return result
}

fun main() {
    printCinemaRoom()
    println("\n\nEnter the number of rows:")
    val rows = readln().toInt()
    println("Enter the number of seats in each row:")
    val seats = readln().toInt()

    val total : Int

    if (rows * seats <= 60){
        total = 10 * (rows * seats)
    } else {
        if (rows % 2 == 0) {
            total = (10 * rows / 2 * seats) + (8 * rows / 2 * seats)
        } else {
            val splitOddRows: List<Int> = round(rows)
            total = (10 * splitOddRows[1] * seats) + (8 * splitOddRows[0] * seats)

        }
    }
    print("Total income:\n$$total")
}
