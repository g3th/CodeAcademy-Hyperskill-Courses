fun main() {

    val days = listOf("Sunday","Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday")

    println("Pick a day ('Sun, Mon, Tue, Wed, Thur, Fri, Sat'): ")

    val day = readln()
    var daysCounter = 0

    days.forEach{
         if (it.contains(day)){
             daysCounter = days.indexOf(it)
         }
    }

    println("Today is ${days[daysCounter]}")
    println("What day will it be in (n) days? (Pick a Number):")
    val num = readln().toInt()

    var loopCounter = 0

    while(loopCounter != num){
        if (daysCounter == 6){
            daysCounter = 0
        } else {
            daysCounter += 1
        }
        loopCounter += 1
    }
    if (num > 1){
        println("In ${num} days, it will be ${days[daysCounter]}")
    } else {
        println("In ${num} day, it will be ${days[daysCounter]}")
    }

}
