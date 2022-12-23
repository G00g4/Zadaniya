import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите стороны a")
    val a= scanner.nextInt()
    println("Введите стороны b")
    val b= scanner.nextInt()
    val P = 4*a
    val S = a*b
    println("P = $P")
    println("S = $S")
}