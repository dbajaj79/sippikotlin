package enumdemo

enum class ColorWithTemperature(val r:Int,val g:Int,val b:Int)
{
    BLUE(0,0,255)
    {
        val tempeature=Temprature.COLD
    },
    BLACK(0,0,255)
    {
        val tempeature=Temprature.WARM
    },
    GREEN(0,0,255)
    {
        val tempeature=Temprature.HOT
    };
    init {
        require(r in 0..255)
        require(r in 0..255)
        require(r in 0..255)
    }
    fun rgb()= r shl 16+g shl 8 + b

}