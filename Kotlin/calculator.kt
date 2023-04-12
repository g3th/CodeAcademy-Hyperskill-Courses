class Calculator(val name: String){
  
  init {
    println("${name}'s calculator'")
  }

  fun add(num1: Int, num2: Int) : Int {
    print("${num1} + ${num2} = ")
    return num1 + num2
  }

  fun subtract(num1: Int, num2: Int) : Int {
    print("${num1} - ${num2} = ")
    return num1 - num2
  }

  fun multiply(num1: Int, num2: Int) : Int {
    print("${num1} * ${num2} = ")
    return num1 * num2
  }

  fun divide(num1: Int, num2: Int) : Int {
    print("${num1} / ${num2} = ")
    return num1 / num2
  }

  fun power(num1: Int, num2: Int) : Int {
    print("${num1} to the power of ${num2} = ")
    var counter = 1
    var result = num1
    while (counter < num2){
      result = result * num1
      counter += 1
    }
    return result
  }
}


fun main(){
  
  val texasInstruments = Calculator("Codey")
  var splitDigits = mutableListOf<Int>()
  var Operator = ""
  println("Enter Operation (i.e 1 + 1): ")
  val operation = readln().split(" ").forEach {
  	if (it.toIntOrNull() == null){
  		Operator = it
  		} else {
  			splitDigits.add(it.toInt())	
  			}
	}
	when(Operator){
		"+" -> println("${texasInstruments.add(splitDigits[0], splitDigits[1])}")
		"-" -> println("${texasInstruments.subtract(splitDigits[0], splitDigits[1])}")
		"/" -> println("${texasInstruments.divide(splitDigits[0], splitDigits[1])}")
		"*" -> println("${texasInstruments.multiply(splitDigits[0], splitDigits[1])}")
		"^"	-> println("${texasInstruments.power(splitDigits[0], splitDigits[1])}")
	}
  
}
