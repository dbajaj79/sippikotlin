package kotlinfunctions

import java.util.*

fun main(args: Array<String>) {
dayOfWeek()
}
fun dayOfWeek()
{
    println("What day is it today?")
    println(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
    val todayDayNumber = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
   val dayName= when(todayDayNumber)
    {
        1-> "Sunday"
        2-> "Monday"
        3-> "Tuesday"
        4-> "Wednesday"
        5-> "Thursday"
        6-> "Friday"
        else-> "Saturday"
    }
    println(dayName)
}
