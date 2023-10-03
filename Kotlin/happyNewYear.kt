fun countDown(secondsToMidnight: Int){
  if (secondsToMidnight == 0){
    println("Happy New Year!")
  } else {
    println(secondsToMidnight)
    countDown(secondsToMidnight - 1)
  }
}


fun main() {
  countDown(10)
}
