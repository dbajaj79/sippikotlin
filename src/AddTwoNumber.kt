fun main(args: Array<String>) {
    var a=0
    var b=0
    println("Enter Two Number")
    a = readLine()?.toInt()!!
    b = readLine()?.toInt()!!

    val sum = a+b
    println("Sum of Two Numbers are $a+$b=$sum")

}