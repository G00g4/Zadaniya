import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите числа больше нуля")
    var A= scanner.nextInt()
    var B= scanner.nextInt()
    var C= scanner.nextInt()
    if (A>0 && B>0 && C>0)
        println("Условие выполняется (A=$A; B=$B; C=$C)")
    else println("Условия не выполнились (A=$A; B=$B; C=$C)")
}