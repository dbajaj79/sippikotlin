fun main() {
    println("Enter a Number")
    val number = readLine()?.toInt()!!
    if(number%2==0)
    {
        println("Entered Number is Even")
    }
    else
    {
        println("Entered Number is Odd")
    }
}