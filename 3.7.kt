import java.util.Scanner
import kotlin.math.pow
fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите A=")
    val A= scanner.nextInt()
    if (A!=0)
    {
        println("Введите B=")
        val B= scanner.nextFloat()
        println("Введите C=")
        val C = scanner.nextInt()
        val D = B.pow(2)-4*A*C
        if (D>=0)
            println("A·x^2 + B·x + C = 0 имеет вещественные корни(A=$A; B=$B; C=$C; D=$D)")
        else println("A·x^2 + B·x + C = 0 не имеет вещественные корни(A=$A; B=$B; C=$C; D=$D)")
    }
    else println("A должно не равным 0")
}