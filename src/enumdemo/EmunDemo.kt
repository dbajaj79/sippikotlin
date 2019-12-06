package enumdemo

fun main() {
    val selectedColor = Color.valueOf("BLUE")
    val selectedKotlinColor = enumValueOf<Color>("BLUE")
    if(selectedColor==Color.BLUE)
    {
        println("Yes Both are true")
    }
    if(selectedKotlinColor==Color.BLUE)
    {
        println("Yest it is a kotlin way")
    }
    //Java ways to Print Enums
    for(color in Color.values())
    {
        println("name=${color.name},Oridinal=${color.ordinal}")
    }
    for(color in enumValues<Color>())
    {
        println("name=${color.name},Oridinal=${color.ordinal}")
    }
    printHex(ColorWithRGB.BLUE.rgb())

    printHex(ColorWithTemperature.BLACK.rgb())
    println(ColorWithTemperature.BLACK)
}