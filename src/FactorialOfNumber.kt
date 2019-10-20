fun main()
{
    println("Enter a Number")
    var a = readLine()!!.toInt()
    var factorialNumber=1
    for(i in 2..a)
    {
        factorialNumber=factorialNumber*i;
    }
    println("Factorial Number:$factorialNumber")

}