/** Example Kotlin application for Functions
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
fun main() {
    great()
    greet("Gopal")
    greets("JamesBond", 3)
    greetings("JamesBond", 3)
    max(10, 15)
    val printMin = min(10, 15)
    println(printMin)
    println(double(6))
    println(double2(6))
    println(printMax(12,24))
}
fun great(name: String="Krishnan")
{
    println("Welcome $name")
}
fun greet(name: String) {
    println("Welcome $name")
}

fun greets(name: String, reps: Int) {
    for (i in 1..reps)
        println("Welcome $name")
}

fun greetings(name: String, reps: Int) {//java function parameter as val so we cant reassign
    var repLeft = reps
    while (repLeft > 0) {
        println("Welcome $name")
        repLeft--
    }
}

fun max(a: Int, b: Int) {
    if (a > b)
        println(a)
    else
        println(b)
}

fun min(a: Int, b: Int): Int {
    var min = if (a < b) a else b
    return min
}

fun double(num: Int): Int {
    return num * 2
}

/*
* Single-expression function
* */

fun double2(num: Int) = num * 2
fun printMax(a: Int, b: Int) = if (a > b) a else b
