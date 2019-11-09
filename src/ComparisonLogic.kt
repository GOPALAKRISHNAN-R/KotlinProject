/** Example Kotlin application for Comparison Logic
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
fun main() {
    //Comparison operation Boolean results
    println("2>1 is:${2 > 1}")
    println("2<1 is:${2 < 1}")

    println("1>=1 is:${1 >= 1}")
    println("1<=1 is:${1 <= 1}")

    println("1==1 is:${1 == 1}")
    println("2==1 is:${2 == 1}")

    println("1!=1 is:${1 != 1}")
    println("2!=1 is:${2 != 1}")

    println("!(2>1) is:${!(2 > 1)}")

    println("true && false:${true && false}")
    println("true || false:${true || false}")

    println("true and false:${true and false}")
    println("true or false:${true or false}")
    println("true xor false:${true xor false}")

    val condition = ((2 > 1) || (3 > 2)) && (2 > 3)
    println(condition)

    val condition1 = (2 > 1) || (3 > 2) && (2 > 3)
    println(condition1)
}