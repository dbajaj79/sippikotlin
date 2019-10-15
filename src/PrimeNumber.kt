fun main() {
    var isPrime = true
    println("Enter a Integer Number")
    val number = readLine()?.toInt()!!
    for(i in 2 until number)
    {
        if(number%i==0)
        {
            isPrime = false
        }
    }
    if(isPrime)
    {
        println("Entered Number $number is Prime Number")
    }
    else
    {
        println("Entered Number $number is not Prime Number")
    }

}