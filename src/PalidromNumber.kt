fun main() {
    println("Enter a Number")
    var number = readLine()!!.toInt()
    var reverse = 0
    val tempNumber = number
    while (number != 0) {
        val digit = number % 10
        reverse = reverse * 10 + digit
        number = number / 10

    }
   if(tempNumber==reverse)
   {
       println("Enter Number $tempNumber is Palidrom Number")
   }
   else
   {
       println("Enter Number $tempNumber is not Palindrom Number")
   }

}
