import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    var a= scanner.nextInt()
    val b=(a/10)/10
    val c=(a/10)%10
    val d=a%10
    println("Сумма= ${b+c+d} ; Произведение = ${b*c*d} \n Из цифр первая цифра= $b, вторая цифра= $c, третья цифра= $d")
}