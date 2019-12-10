package visibilitymodifier

class Test
{
    init {
        count++
        print("Car Created")
    }
    companion object
    {
        init {
            println("Test companion object createated")
        }
        var count:Int=0
        private set
    }
}