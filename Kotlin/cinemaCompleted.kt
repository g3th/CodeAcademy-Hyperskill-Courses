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

fun buyATicket(rows: Int, seats: Int, chosenRow: Int): Pair<Int, Int>{
    var (price, totalEarnings) = Pair(0, 0)
    if (rows * seats <= 60){
        price = 10
        totalEarnings = (rows * seats) * 10
    } else {
        if (rows % 2 == 0) {
            if (chosenRow < rows / 2 ){
                price = 10
            } else {
                price = 8
            }
            totalEarnings = (rows / 2 * seats * 10) + (rows / 2 * seats * 8)
        } else {
            val splitOddRows: List<Int> = round(rows)
            if (chosenRow < splitOddRows[0]){
                price = 10
            } else if (chosenRow >= splitOddRows[0]){
                price = 8
            }
            totalEarnings = (splitOddRows[1] * seats * 10) + (splitOddRows[0] * seats * 8)
        }
    }
    return Pair(price, totalEarnings)
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

fun statistics(ticketsCounter: Int, earnings: Int, totalPossibleEarnings: Int, rows: Int, seats: Int){
    val percentageSold :Double = ticketsCounter.toDouble() / (rows.toDouble() * seats.toDouble()) * 100
    val formatPercentage = "%.2f".format(percentageSold)
    println("Number of purchased tickets: $ticketsCounter")
    println("Percentage: $formatPercentage%")
    println("Current income: \$$earnings")
    println("Total income: \$${totalPossibleEarnings}")
}

fun main() {
    println("\nEnter the number of rows:")
    val rows = readln().toInt()
    println("Enter the number of seats in each row:")
    val seats = readln().toInt()
    var chosenSeat = 0
    var chosenRow = 0
    var ticketCounter = 0
    var currentEarnings = 0
    val cinema = MutableList(rows){ MutableList(seats) { "S" } }
    val seatsTaken = mutableMapOf<Int, Int>()
    var priceOrPossibleEarnings = Pair(0,0)
    printCinemaRoom(cinema)
    while(true) {
        println("\n\n1. Show the seats")
        println("2. Buy a ticket")
        println("3. Statistics")
        println("0. Exit")
        val input = readln().toInt()
        if (input == 1) {
            printCinemaRoom(cinema)
        } else if (input == 2) {
            while (true) {
                try {
                    println("\n\nEnter a row number:")
                    chosenRow = readln().toInt()
                    println("Enter a seat number in that row:")
                    chosenSeat = readln().toInt()
                    seatsTaken[chosenRow] = chosenSeat
                    if (cinema[chosenRow - 1][chosenSeat - 1] == "B") {
                        println("That ticket has already been purchased!")
                    } else {
                        cinema[chosenRow - 1][chosenSeat - 1] = "B"
                        priceOrPossibleEarnings = buyATicket(rows, seats, chosenRow)
                        print("Ticket price: \$${priceOrPossibleEarnings.first}\n")
                        ticketCounter += 1
                        currentEarnings += priceOrPossibleEarnings.first
                        break
                    }
                } catch (e: IndexOutOfBoundsException) {
                    println("Wrong input!")
                }
        }
        } else if (input== 3){
            priceOrPossibleEarnings = buyATicket(rows, seats, chosenRow)
            statistics(ticketCounter, currentEarnings, priceOrPossibleEarnings.second, rows, seats)
        } else if (input == 0){
            break
        }
    }
}
