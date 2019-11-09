/** Example Kotlin application for when
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
fun main()
{
    var time=-12

    when (time) {
        in 0..11 -> println("Good Moring")
        12 -> println("Lunch TIme")
        else -> println("Good day")
    }
    //Based on Condition to display String using variable
    var greetings= when (time) {
        in 0..11 -> "Good Moring"
        12 -> "Lunch TIme"
        else -> "Good day"
    }

    println(greetings)


}
