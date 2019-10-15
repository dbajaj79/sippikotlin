fun main() {
    println("Enter the size of Array")
    val size = readLine()?.toInt()!!
    val numbers = IntArray(size)
    for(i in 0 until size)
    {
        numbers[i]= readLine()?.toInt()!!

    }
    var sum=0.0
    for(i in numbers)
    {
        sum+=i;
    }

    println("Average of Array=${sum/size}")
}