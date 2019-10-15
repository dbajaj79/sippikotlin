fun main() {
    println("Enter Two Integer Numbers")
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()

    if(first>second)
    {
        println("First Entered Number is Greater=$first")
    }
    else
    {
        println("Second Entered Number is Greater=$second")
    }
}