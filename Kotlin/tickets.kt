package cinema

fun printCinemaRoom(rows: Int, seats: Int, chosenRow: Int, chosenSeat: Int) {
    println("\nCinema:")
    for (i in 0..seats) {
        if (i < 1){
            print ("  ")
        }
        else if (i == seats) {
            print ("$i")
        }
        else {
            print ("$i ")
        }
    }
    for (i in 1..rows) {
        print("\n${i} ")
        for (j in 1..seats) {
            if (chosenSeat + chosenRow > 0){
                if (i == chosenRow && j == chosenSeat) {
                    print("B ")
                    continue
                }
            }
            print("S ")
        }
    }
}

fun round(num: Int) : List<Int> {
    val doubleValue : Double = num.toDouble() / 2
    val firstNum : Int
    val result = mutableListOf<Int>()

    if (doubleValue % 1 >= 0.5){
        firstNum = (doubleValue + 1).toInt()
        result.add(firstNum)
        result.add(num - firstNum)
    }
    return result
}

fun main() {
    println("\nEnter the number of rows:")
    val rows = readln().toInt()
    println("Enter the number of seats in each row:")
    val seats = readln().toInt()
    var price = 0
    printCinemaRoom(rows, seats, 0, 0)

    println("\n\nEnter a row number:")
    val chosenRow = readln().toInt()
    println("Enter a seat number in that row:")
    val chosenSeat = readln().toInt()

    if (rows * seats <= 60) {
        price = 10
    } else {
        if (rows % 2 == 0) {
            if( chosenRow < rows / 2 ) {
                price = 10
            } else {
                price = 8
            }
        } else {
            val splitOddRows: List<Int> = round(rows)
            if (chosenRow < splitOddRows[0]) {
                price = 10
            } else if (chosenRow >= splitOddRows[0]) {
                price = 8
            }
        }
    }

    printCinemaRoom(rows, seats, chosenRow, chosenSeat)
    print("\n\nTicket price: \$$price\n")
}
