package stringexamples

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit



fun main() {
    println("Enter a String")
  //  val enteraString = readLine()

   // println(replacelastCommaWithAnd(enteraString!!))
    //println(getFullWhereLastShouldBeOnlyOneCharacter("Ajay", "Gupta"))
    getDifferenceInMin()
    


}


private fun getDifferenceInMin() {
    val dateStart = "11/03/14 09:33:43"
    val dateStop ="11/03/15 9:29:58"

    val format = SimpleDateFormat("yy/MM/dd HH:mm:ss")

    var d1: Date? = null
    var d2: Date? = null
    try {
        d1 = format.parse(dateStart);
        d2 = format.parse(dateStop);
    } catch (e: ParseException) {
        e.printStackTrace();
    }

    val diffInMillies = Math.abs(d2?.time!! - d1?.getTime()!!)
    val diff = TimeUnit.MINUTES.convert(diffInMillies, TimeUnit.MILLISECONDS)
    // Get msec from each, and subtract.
    /* val diff = d2?.time!! - d1?.time!!
     val diffSeconds = diff / 1000 % 60;
     val diffMinutes = diff / (60 * 1000) % 60;
     val diffHours = diff / (60 * 60 * 1000);*/
    // System.out.println("Time in seconds: " + diffSeconds + " seconds.");
    System.out.println("Time in minutes: " + diff + " minutes.");
    //   System.out.println("Time in hours: " + diffHours + " hours.");

}

private fun getDifferenceInMin(today:Calendar,bookingDate:Calendar) {
    val dateStart = "11/03/14 09:33:43"
    val dateStop ="11/03/15 9:29:58"

    val format = SimpleDateFormat("yy/MM/dd HH:mm:ss")

    var d1=today.time
    var d2 =bookingDate.time


    val diffInMillies = Math.abs(d2?.time!! - d1?.getTime()!!)
    val diff = TimeUnit.MINUTES.convert(diffInMillies, TimeUnit.MILLISECONDS)
    // Get msec from each, and subtract.
    /* val diff = d2?.time!! - d1?.time!!
     val diffSeconds = diff / 1000 % 60;
     val diffMinutes = diff / (60 * 1000) % 60;
     val diffHours = diff / (60 * 60 * 1000);*/
    // System.out.println("Time in seconds: " + diffSeconds + " seconds.");
    System.out.println("Time in minutes: " + diff + " minutes.");
    //   System.out.println("Time in hours: " + diffHours + " hours.");

}

private fun replacelastCommaWithAnd(enteraString: String): String {
    if (!enteraString.contains(",")) {
        return enteraString
    } else {
        val firstPart = enteraString!!.substring(0, enteraString!!.lastIndexOf(","))
        val secondPart: String =
            (enteraString.subSequence(enteraString!!.lastIndexOf(","), enteraString.length)).toString()
        val finalString = "$firstPart${secondPart.replace(",", " and ")}"
        return finalString.replace(",", ", ")
    }


}

private fun getFullWhereLastShouldBeOnlyOneCharacter(firstName: String, lastName: String?) =
    "$firstName ${lastName?.get(0) ?: " "}"