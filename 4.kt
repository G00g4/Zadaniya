import java.util.Scanner
import kotlin.math.pow
fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите стороны a")
    val a= scanner.nextDouble() //Почему можно использовать только float и double для pow? Как использовать int?
    val V=a.pow(3)
    println("V = $V")

}