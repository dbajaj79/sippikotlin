package namealias
import namealias.test.Test as T1
import namealias.test1.Test as T2

fun main() {
    val testfromtestpackage=T1()
    val testfromtest1Package=T2()
    testfromtest1Package.sayHello()
    testfromtestpackage.sayHello()
}