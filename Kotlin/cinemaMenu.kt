package cinema

fun printCinemaRoom(seatsAndRows: MutableList<MutableList<String>>) {
    println("\nCinema:")
    print("  ")
    for (i in seatsAndRows[0].indices){
        if(i != seatsAndRows[0].size-1){
            print("${i+1} ")
        } else {
            print("${i+1}")
        }
    }
    println()
    for (i in seatsAndRows.indices){
        print("${i+1} ")
        for(j in seatsAndRows[i].indices) {
            if(j != seatsAndRows[i].size-1) {
                print("${seatsAndRows[i][j]} ")
            } else {
                print(seatsAndRows[i][j])
            }
        }
        println()
    }

}

fun buyATicket(rows: Int, seats: Int, chosenRow: Int): Int{
    var price = 0
    if (rows * seats <= 60){
        price = 10
    } else {
        if (rows % 2 == 0) {
            if( chosenRow < rows / 2 ){
                price = 10
            } else {
                price = 8
            }
        } else {
            val splitOddRows: List<Int> = round(rows)
            if (chosenRow < splitOddRows[0]){
                price = 10
            } else if (chosenRow >= splitOddRows[0]){
                price = 8
            }
        }
    }
    return price
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
    val cinema = MutableList(rows){ MutableList(seats) { "S" } }
    printCinemaRoom(cinema)
    while(true) {
        println("\n\n1. Show the seats")
        println("2. Buy a ticket")
        println("0. Exit")
        val input = readln().toInt()
        if (input == 1) {
           printCinemaRoom(cinema)
        } else if (input == 2){
            println("\n\nEnter a row number:")
            val chosenRow = readln().toInt()
            println("Enter a seat number in that row:")
            val chosenSeat = readln().toInt()
            cinema[chosenRow-1][chosenSeat-1] = "B"
            val priceReturned = buyATicket(rows, seats, chosenRow)
            print("Ticket price: \$$priceReturned\n")
        } else if (input == 0){
            break
        }
    }
}
