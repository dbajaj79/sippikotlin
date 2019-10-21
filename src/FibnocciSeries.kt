fun main() {
    println("Enter a number")
    var t2=1
    var t1=0
    var nextTerm=0
    val number = readLine()!!.toInt()
    if(number<=1)
    {
        println(number)
    }
    else
    {

        for(i in 1..number)
        {
          print("$t1,")
          nextTerm = t1+t2
            t1=t2
            t2=nextTerm
        }
    }
}