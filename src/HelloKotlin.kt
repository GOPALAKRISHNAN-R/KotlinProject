/** Example Kotlin application for variable declaration
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
//main function
fun main() {

    println("Hello,World!")
    sayHelloKotlin()//function calling

    /*
    * variable declaration
    * 1)var variable_name:type=value
    * 2)var variable_name:type
    * */

    val exampleDouble2: Double
    exampleDouble2 = 2.88
    println(exampleDouble2)

    val userName: String = "JamesBond"  //declared type explicitly
    var age: Int = 25

    println("My name is,$userName.Iam $age years old.In 2 years ,I will be ${age + 2}")


    /*
    * Primitive DataTypes
    * Literals
    * Implicit type conversion
    * */

    val exampleChar = 'a'
    println(exampleChar)

    val exampleBoolean = true
    println(exampleBoolean)

    val exampleShort = 12
    println(exampleShort)

    val exampleInt = exampleShort
    println("$exampleInt")

    val exampleLong = 12L
    println(exampleLong)

    val exampleFloat = 12.1F
    println(exampleFloat)

    val exampleDouble = 12.1
    println(exampleDouble)

    /*Explicit conversion
    * */

    val exInt: Int = 2898
    val exShort: Short = exInt.toShort()
    println("$exShort")

    /*
    *   String Data Type
    * */
    val exampleString = " Test"
    println("$exampleString")

    val exampleString1 = "\"Test\n Sample\""
    println("$exampleString1")

    val exampleRawString = """Hello
        |John
    """.trimMargin()
    println("$exampleRawString")

//character for loop.
    var names = "Jamesbond"
    for (name in names)
        println(name)

    //print number 1 to 10
    for (i in 1..10)
        println(i)

    //print number 1 to 9
    for (i in 1 until 10)
        println(i)

    //print number 10 to 1
    for (i in 10 downTo 1)
        println(i)

    //print numbers between 1 to 10 skip even positions
    for (i in 1..10 step 2)
        println(i)

    //print a to z
    for (i in 'a'..'z' )
        println(i)

    //print a to z skip even position
    for (i in 'a'..'z' step 2)
        println(i)

}

//sub function
fun sayHelloKotlin() {
    println("Hello,Kotlin!")
}

