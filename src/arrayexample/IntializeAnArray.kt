package arrayexample

fun main() {
    val array = arrayOf("Deepak",1,10.0,20,30,40,"C")
    for(i in array)
    {
        println(i)

    }
    val array2 = Array(5){2*it}
    for((i,value) in array2.withIndex())
    {
        println("inext $i,value $value")
    }
    val numbers = intArrayOf(10,44,56,67,90,34,56,77,23,56,89)
    val numberlist = mutableListOf<Int>()
    for(i in numbers)
    {
        numberlist.add(i)
    }
    println(numberlist)
    val listofNumberDividedBySeven = mutableListOf<Int>()
    for(i in 0..100 step 7) listofNumberDividedBySeven.add(i)

    println(listofNumberDividedBySeven)

}