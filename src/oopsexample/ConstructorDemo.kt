package oopsexample
class Sample()
class  ConstructorDemo ( var name:String,var age:String)
{

    fun printValues()
    {
        println(name)
        println(age)
    }


}
/* Example 4 Primary Constructor without consutructor keyword
constructor key is not required while you need to need to your access modifier like private,public,protected and @Inject  annotation
class  ConstructorDemo ( var name:String,var age:String)
{

    fun printValues()
    {
        println(name)
        println(age)
    }


}*/

/*Example 3 primary constructor in concise and shorter way
class  ConstructorDemo constructor( var name:String,var age:String)
{

    fun printValues()
    {
        println(name)
        println(age)
    }


}*/
/*Example 2 Constructor without initBlock
class  ConstructorDemo constructor( name:String,age:String)
{
    var name=name
    var age=age

    fun printValues()
    {
        println(name)
        println(age)
    }


}*/
/*
Example One primary constructor with  init block to initilize propeties
class  ConstructorDemo constructor( name:String,age:String)
{
    var name:String
    var age:String
    init {
        this.name = name
        this.age=age
    }
    fun printValues()
    {
        println(name)
        println(age)
    }


}
*/

fun main() {
    val demo = ConstructorDemo("Deepak","10")
    demo.printValues()
    val sample = Sample()


}