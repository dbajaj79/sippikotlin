fun main() {
    println("Enter the size of Array")
    val size = readLine()?.toInt()!!
    val numbers = IntArray(size)
    for (i in 0 until size) {
        numbers[i] = readLine()?.toInt()!!

    }
    var smallerno = numbers[0]
    for (i in numbers) {
        if (i > smallerno) {
            smallerno = i
        }
    }
    println("Smaller No of Array Element=$smallerno")

}