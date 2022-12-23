import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    var a= scanner.nextInt()
    val b=a/10
    val c=a%10
    println("Сумма= ${b+c} ; Произведение = ${b*c} \n Из цифр первая цифра= $b, вторая цифра= $c")
}