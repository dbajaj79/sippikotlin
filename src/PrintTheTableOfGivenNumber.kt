fun main() {
    println("Enter a Integer Number")
    val number = readLine()?.toInt()!!
    for(i in 1..10)
    {
        println("$number*$i=${number*i}")
    }
}