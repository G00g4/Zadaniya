import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите числа ")
    var A= scanner.nextInt()
    var B= scanner.nextInt()
    if (A>2 && B<=3)
        println("Условие выполняется A>2 и B<=3 (A=$A; B=$B)")
    else println("Условия не выполнились (Треб. условия: A>2 и B<=3) (A=$A; B=$B)")
}