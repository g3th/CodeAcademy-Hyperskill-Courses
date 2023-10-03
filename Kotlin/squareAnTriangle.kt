fun main() {

  val sqSide = 7
  val sqChar1 = "X  "
  val sqChar2 = "O  "

  for (i in 1..sqSide){
    println()
    for (j in 1..sqSide){
      if (i %2 == 0 && j % 2==0 || i %2 !=0 && j %2 !=0){
        print(sqChar1)
      } else{
        print(sqChar2)
      }
    }
  }

  val triRows = 10
  var triCount = 0
  var triRowLen = triRows
  val triChar1 = "/  "
  val triChar2 = "   "

  for (i in 1..triRows){
    println()
     if(triCount!=1 && triCount!=triRowLen && i!=triRows+1){
        print(triChar2)
      }
    while(triCount < triRowLen){
        triCount +=1
        print(triChar1)
      }
    triCount = 0
    triRowLen -=1
  }
}
