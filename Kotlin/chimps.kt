fun main() {

    val responsibilities = listOf("feed the chimps","play a random game","conduct a health check on Foxie")

    var responsibilitiesComplete = 0
    var timeSpent = 0
    var totalShiftTime = 4

    var foxiesHealthCheck = mutableMapOf<String, Any?>()
    var chimpsHaveEaten = mutableMapOf("Bonnie" to false,"Jubilee" to false,"Frodo" to false,"Foxie" to false)

    println("First, ${responsibilities[0]}")

    println("Feeding Bonnie")
    chimpsHaveEaten["Bonnie"] = true
    chimpsHaveEaten["Jubilee"] = true
    chimpsHaveEaten["Frodo"] = true
    chimpsHaveEaten["Foxie"] = true

    timeSpent += 1
    responsibilitiesComplete += 1

    println("\nAll chimps have now been fed! You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

    println("Next, ${responsibilities[1]}") 

    val games = setOf("\ntug-of-war with a blanket","catch and throw","number game")

    var randomGame = games.random()

    println(randomGame)
    timeSpent += 1
    responsibilitiesComplete += 1

    println("\nEach chimp has now played a game of $randomGame! You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

     println("Next, ${responsibilities[2]}")

     foxiesHealthCheck.put("temperature", 32.7)

     foxiesHealthCheck.put("mood","happy")

     println("\nFoxie has a temperature of ${foxiesHealthCheck["temperature"]} and is feeling ${foxiesHealthCheck["mood"]}.")

    timeSpent += 1
    responsibilitiesComplete += 1
     println("\nEach chimp has now played a game of $randomGame! You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

  if (timeSpent <= totalShiftTime && responsibilitiesComplete == responsibilities.size){
    println("\nBoss says: 'Well done, slave.'")
  }
  else if (timeSpent >= totalShiftTime && responsibilitiesComplete == responsibilities.size){
    println("\nBoss says: 'You deserve half a pence more.'")
  } else {
    println("\nBoss says: 'Not all responsibilities were complete. You are sacked, without pay, and we will litigate, take your home and your children.'")
  }
}
