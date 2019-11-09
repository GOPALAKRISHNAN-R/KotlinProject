/** Example Kotlin application for Loop Concepts
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
fun main() {
    var i = 0
    //print 0 to 4
    while (i < 5) {
        println(i)
        i++
    }

    //print 0 to 10
    while (i < 10) println(i++)

    //print 1 to 5
    while (i < 5) println(++i)
    i = 5
    do {
        println(i)
        i++
    } while (i < 5)

    //nested loop
    var k = 0
    do {
        println(k)
        k++
        var j = 0
        while (j < 5) {
            println("---$j")
            j++
        }
    } while (k < 5)

    //Given number divided by 2 and find the count total
    var number=8
    var counter=0
    while (number>1)
    {
        number/=2
        counter++
    }
    println(counter)

}
