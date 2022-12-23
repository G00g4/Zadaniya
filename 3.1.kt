import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите число ")
    var a= scanner.nextInt()
    if (a>0)
        println("Число  положит ($a)")
    else if (a==0)
        println("Число = нулю ($a)")
        else println("Число отриц ($a)")
}