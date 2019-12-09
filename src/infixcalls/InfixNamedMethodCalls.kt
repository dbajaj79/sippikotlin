package infixcalls

fun main() {
    val mountain = "Everest"
    val pair = mountain to 1000
    println(pair.first)
    println(pair.second)
    val customPoint = CustomPoint(10,30)
    customPoint swiftRight 20
    println(customPoint.x)
    println(customPoint.y)
}