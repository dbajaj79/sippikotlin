package enumdemo

enum class ColorWithRGB(val r:Int,val g:Int,val b:Int)
{
    BLUE(0,200,255),
    PINK(50,79,35),
    ORANGE(255,165,0),
    BLACK(10,30,50),
    VOILET(50,79,35),
    GREEN(60,70,89);
    fun rgb()= r shl 16 +g shl 8+b
    init {
        require(r in 0..255)
        require(g in 0..255)
        require(b in 0..255)
    }


}
fun printHex(num:Int)
{
    println(num.toString(16))
}