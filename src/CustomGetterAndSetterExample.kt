class Fruit(var weight:Double,val fresh:Boolean)
{
    var ecoRating:Int = 3

}
class Apple(var weight:Double,val fresh:Boolean)
{
    var ecoRating:Int = when(weight)
    {
        in 0.5..2.0-> 5
        in 0.4..0.5->4
        in 0.3..0.4->3
        in 0.2..0.3->2
        else->1
    }
}