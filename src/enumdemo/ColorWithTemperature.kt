package enumdemo

enum class  Temperature{
    WARM,HOT,COLD
}
enum class ColorWithTemperature (val r:Int,val g:Int,val b:Int)
{
    BLUE(10,20,30)
    {
        override val temperature=Temperature.COLD
    },
    BLACK(20,30,50)
    {
        override val temperature=Temperature.HOT
    };
    init{
        require(r in 0..255)
        require(g in 0..255)
        require(b in 0..255)
    }
    fun rgb()=r shl 16+g shl 8 + b

    abstract val temperature:Temperature

}