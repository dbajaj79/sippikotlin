fun main() {
    println("Enter Two Integer Number")
    val first = readLine()?.toInt()!!
    val second = readLine()?.toInt()!!
    println("Enter your choice\n A for Addition\n M for Multiply \n D for Division \n S for Substration")
    val userChoice= readLine()
    val result = when(userChoice)
    {
        "A","a"-> "Addition of Number $first+$second=${first+second}"
        "S","s"-> "SubStraction of Two Number $first-$second=${first-second}"
        "M","m"->  "Multiplication of Two Number $first*$second =${first*second}"
        "D","d"->  "Division of Two Number= $first/$second=${first/second}"
        else->"Sorry Wrong Choice"
    }
    println("Calcuatlation Result=$result")
}