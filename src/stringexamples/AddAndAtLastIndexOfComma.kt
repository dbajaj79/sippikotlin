package stringexamples

fun main() {
    println("Enter a String")
    val enteraString = readLine()

   println(replacelastCommaWithAnd(enteraString!!))
   println(getFullWhereLastShouldBeOnlyOneCharacter("Ajay","Gupta"))


}

private fun replacelastCommaWithAnd(enteraString:String):String
{
    if(!enteraString.contains(","))
    {
        return enteraString
    }
    else
    {
        val firstPart = enteraString!!.substring(0,enteraString!!.lastIndexOf(","))
        val secondPart:String = (enteraString.subSequence(enteraString!!.lastIndexOf(","),enteraString.length)).toString()
        val finalString = "$firstPart${secondPart.replace(","," and ")}"
        return finalString.replace(",",", ")
    }


}
private fun getFullWhereLastShouldBeOnlyOneCharacter(firstName:String,lastName:String?) = "$firstName ${lastName?.get(0) ?: " "}"