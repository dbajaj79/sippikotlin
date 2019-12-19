package functionsinkotlin.functiontype
//Example 1 Explicitly Define the value of function type
/*val a:(Int)-> Int =fun(i:Int)=i*2
val b:()->Int = fun():Int {return 4}
val c :(String)->Unit = fun(s:String){ print(s)}*/

//Example 2
/*
val a=fun(i:Int)=i*2
val b=fun()=4
val c=fun(s:String)= println(s)
*/

//Example 3 Opposite Direction
val a :(Int)->Int=fun(i)=i*2
val b : ()->Int = fun()=4
val c :(String)->Unit= fun(s)= print(s)
fun main() {
    println(a(10))
    println(b())
    c("Kotlin is Rock")
}