fun main() {
    println("Enter the size of Array")
    val size = readLine()?.toInt()!!
    val numbers = IntArray(size)
    for(i in numbers)
    {
        numbers[i]= readLine()?.toInt()!!

    }
    var greaterno=numbers[0]
    for(i in numbers)
    {
        if(i>greaterno)
        {
            greaterno = i
        }


    }
    println("Greater No of Array Element=$greaterno")

}