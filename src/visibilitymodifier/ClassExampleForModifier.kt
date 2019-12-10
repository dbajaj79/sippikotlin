package visibilitymodifier

internal class ClassExampleForModifier private constructor()
{
    var weight:Double? = null
    companion object
    {
        fun create()=ClassExampleForModifier()
    }
}

fun main() {
    var classExampleForModifier:ClassExampleForModifier?=null
    classExampleForModifier = ClassExampleForModifier.create()
}