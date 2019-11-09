/** Example Kotlin application for Arithmetic Operation
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
fun main() {
    println("Arithmetic Operation")
    var a = 20
    var b = 10
    var c = 13

    println("a= $a b= $b")

    println("a+b=${a + b}")
    println("a-b=${a - b}")
    println("a*b=${a * b}")
    println("a/b=${a / b}")
    println("a%b=${a % b}")

    println("2+2*3=${(2 + 2) * 3}")

    println("++b:${++b}")

    println("b++:${b++}")

    println("b=$b")

    println("--c:${--c}")

    println("c--:${c--}")

    println("c=$c")

    a += 2
    println("a+=2 $a")

    a -= 2
    println("a-=2 $a")

    a *= 2
    println("a*=2 $a")

    a /= 2
    println("a/=2 $a")

    a %= 2
    println("a%=2 $a")

    val result = a + b//variable to store result
    println(result)
}
/*
* REPL (Read Eval Print Loop)
* GO TO TOOLS -> Kotlin -> Kotlin REPL
*
* */