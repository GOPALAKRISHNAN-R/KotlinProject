/** Example Kotlin application for Conditional Concepts
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
fun main()
{
    for (i in 1..10)
    {
        if (i==3)continue   //skip number 3
        println(i)
    }

    for (i in 1..10)
    {
        if (i in 4..7) continue
            println(i)
    }

    //Based on Condition to display String
    var time=-12

    if (time in 0..11)
        println("Good Moring")
    else if(time == 12)
        println("Lunch TIme")
    else
        println("Good day")

    //Based on Condition to display String using variable
    var greetings=if (time in 0..11)
        "Good Moring"
    else if(time == 12)
        "Lunch TIme"
    else
        "Good day"

    println(greetings)


}
