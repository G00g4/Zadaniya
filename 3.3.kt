import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите число ")
    var a= scanner.nextInt()
    if (a%2!=0)
        println("Число  чет ($a)")
    else println("Число нечет ($a)")
}