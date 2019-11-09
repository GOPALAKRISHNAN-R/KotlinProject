/** Example Kotlin application for Array
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
fun main() {

    //one dimensional array
    val names = arrayOf("Gopal", "Hari", "Bablu", "Krishna", "gone")
    val numbers = arrayOf(1, 2, 3, 4)
    var numbersNames = arrayOf(1, "Bob")
    println("${numbersNames[0]} ${numbersNames[1]}")
    println("First element:${names[0]}")

    names[0] = "Gopalakrishnan" //  Replace string position 0

    println("${names[0].length}")   //  Getting length of the string array position 0
    println("${names[0][2]}")   //  Getting array element of Position 0 and get its 3rd character

    println("First element:${names[0]}")
    println("Second element:${names[1]}")
    println("Third element:${names[2]}")
    println("Forth element:${names[3]}")
    println("size of the array:${names.size}")
    //getting Last element in an Array
    println(names.last())
    println(names[names.lastIndex])

    println("First element:${numbers[0]}")

    /*
    * for loop
    * */

    for (name in names) {
        println(name)
    }
//print index and corresponding value
    for (index in names.indices) {
        println("Index:${index},Element:${names[index]}")
    }

    //two dimensional array / multi-dimension

    var arrayD = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )

    println("position(1,1):${arrayD[1][1]}")
    println("position(1,2):${arrayD[1][2]}")


}