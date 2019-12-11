package sealedclasses

fun main() {
    val grapes = Grapes()
    getFruitType(grapes)
}
fun getFruitType(fruit: Fruit)
{
    when(fruit)
    {
        is Grapes-> println("Grapes")
        is Apple -> println("Apple")
        is Orange-> println("Orange")
        is PineApple-> println("Pine Apple")

    }
}