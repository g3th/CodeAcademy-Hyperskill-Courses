package cinema

fun printCinemaRoom(rows: Int, seats: Int){
    println("Cinema:")
    for (i in 0..seats){
        if (i < 1){
            print ("  ")
        }
        else if (i == seats){
            print ("$i")
        }
        else {
            print ("$i ")
        }
    }
    for (i in 1..rows){
        print("\n${i} ")
        for (j in 1..seats){
            print("S ")
        }
    }
}

fun round(num: Int) : List<Int> {
    var doubleValue : Double = num.toDouble() / 2
    var firstNum : Int
    var result = mutableListOf<Int>()

    if (doubleValue % 1 >= 0.5){
        firstNum = (doubleValue + 1).toInt()
        result.add(firstNum)
        result.add(num - firstNum)
    }
    return result
}

fun main() {
    println("Enter the number of rows:")
    val rows = readln().toInt()
    println("Enter the number of seats in each row:")
    val seats = readln().toInt()

    printCinemaRoom(rows, seats)

    var total = 0
    if (rows * seats <= 60){
        total = 10 * (rows * seats)
    } else {
        if (rows % 2 == 0) {
            total = (10 * rows / 2 * seats) + (8 * rows / 2 * seats)
        } else {
            val splitOddRows: List<Int> = round(rows)
            println(splitOddRows[0])
            total = (10 * splitOddRows[1] * seats) + (8 * splitOddRows[0] * seats)

        }
    }
    print("\nTotal income:\n$$total")
}
