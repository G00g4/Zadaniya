import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите числа ")
    var A= scanner.nextInt()
    var B= scanner.nextInt()
    if (A%2!=0 && B%2!=0)
        println("Условие выполняется (A=$A; B=$B)")
    else println("Условия не выполнились (A=$A; B=$B)")
}