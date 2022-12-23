import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    var A= scanner.nextInt()
    var B= scanner.nextInt()
    println("Старое значение A $A. Старое значение B $B")
    var c = A + B
    B = c - B
    A = c - A
    println("Новое занчение A $A. Новое занчение B $B")
}