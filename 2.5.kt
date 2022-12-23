import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите первоначальное число ")
    var a= scanner.nextInt()
    //Получаем цифры из числа
    var b=(a/10)/10
    var c=(a/10)%10
    var d=a%10
    //Меняем разряды
    c*=100
    d*=10
    println("Полученное число= ${b+c+d}")
}