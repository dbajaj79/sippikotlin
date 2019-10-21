fun main() {
    println("Enter a Number")
    var sum=0

    var number = readLine()!!.toInt()
    val temp=number
    while (number!=0)
    {
        val digit = number%10
        sum=sum+(digit*digit*digit)
        number = number/10
    }
    if(temp==sum)
    {
        println("Entered Number $temp is ArmStrong")
    }
    else
    {
        println("Enter Number is $temp is not Arm Strong")
    }

}