fun main(args: Array<String>) {
    println("Enter a Temprature in Celsius")
    val d= readLine()?.toFloat()!!
    println("Select Option to Convert\nF for Fahrenheit\n K for Kelvin")
    val choice = readLine()
    val result = when(choice)
    {
        "F","f"->"Temperature in Ferniheat=${(d*9/5)+32}" //(0.5°C × 9/5) + 32 = 32.9°F
        "K","k"->"Temperature in Kelvin=${(d+273.15)}"//0.5°C + 273.15 = 273.65K
        else-> "Sorry wrong choice"
    }
    println(result)
}

//Output

//Enter a Temprature in Celsius
//1
//Select Option to Convert
//F for Ferniheat
//K for Kelvin
//k
//Temperature in Kelvin=274.15
