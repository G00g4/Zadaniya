import java.util.Scanner
import kotlin.math.pow
fun main() {
    println("Введите значение x")
    val scanner = Scanner(System.`in`)
    val x= scanner.nextFloat()
    val y = 3*x.pow(6)-6*x.pow(2)-7
    println("Функция y=  $y, при x= $x")
}