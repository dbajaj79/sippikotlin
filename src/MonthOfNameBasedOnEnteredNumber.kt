fun main() {
    println("Enter a Number")
    val number = readLine()!!.toInt()
    var monthName = when (number) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8-> "Auguest"
        9-> "September"
        10->"October"
        11->"November"
        12->"December"
        else -> "Sorry Wrong Input"

    }
    print(monthName)

}
