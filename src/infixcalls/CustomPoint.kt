package infixcalls

data class CustomPoint(val x:Int,val y:Int)
{
    infix fun swiftRight(point:Int)=CustomPoint(x+point,y)
}