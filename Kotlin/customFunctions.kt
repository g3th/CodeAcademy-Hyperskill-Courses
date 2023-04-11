fun getListOfNumbers() : List<Int>{
    val myList = mutableListOf<Int>()
    var counter = 0
    var flag = false

    while (counter < 7){
        println("Enter 7 different numbers (${counter+1}/7) : ")
        val userNum = readln().toInt()
        myList.forEach{
            if(it == userNum){
                flag = true
            }
        }
        if (flag){
            print("This number exists\n")
            flag = false
            continue
        }
        else {
            myList.add(userNum)
            counter +=1
        }
        println(myList[0])
    }
    return myList
}

fun findMax(userNum: List<Int>) : Int{
    var largestNumber = userNum[0]
    for (i in userNum){
        if (i > largestNumber){
            largestNumber = i
        }
    }
    return largestNumber
}

fun findMin(userNum: List<Int>) : Int{
    var smallestNumber = userNum[0]
    for (i in userNum){
        if (i < smallestNumber){
            smallestNumber = i
        }
    }
    return smallestNumber
}

fun findAverage(userNum : List<Int>) : Int{
    var sum = 0
    for (i in userNum){
        sum += i
    }
    return sum / userNum.size
}

fun checkIfListContains(userList: List<Int>, num: Int) : Boolean{
    for (i in userList){
        if (i == num){
            return true
        }
    }
    return false
}

fun main() {

    val values = getListOfNumbers()
    val largestValue = findMax(values)
    val smallestValue = findMin(values)
    val average = findAverage(values)
    println(values)
    println("\nThe largest number is $largestValue")
    println("\nThe smallest number is $smallestValue")
    println("\nThe average is $average")
    println("\nEnter a number: ")
    val numToFind = readln().toInt()
    val containsValue = checkIfListContains(values, numToFind)
    if (containsValue){
        println("The value entered exists within the list of Integers.")
    } else{
        println("The value entered is not present in the list of Integers.")
    }
}
