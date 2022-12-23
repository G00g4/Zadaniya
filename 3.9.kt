import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    println("введите 3 стороны")
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    if (a<b+c) println("Треуг. существ. (a=$a; b=$b; c=$c)")            //Условие выполняется (Треуг. сушеств.)
        else println("Треуг. не может существовать(a=$a; b=$b; c=$c)")                                                  //Условие не выполн.(a>b+C или a=b+c)
    if (b<a+c) println("Треуг. существ. (a=$a; b=$b; c=$c)")                                                //Условие выполн
        else println("Треуг. не может существовать(a=$a; b=$b; c=$c)")                                                  //Условие не выполн(b>a+c или b=a+c)
    if (c<a+b) println("Треуг. существ. (a=$a; b=$b; c=$c)")                                                //Условие выполн
        else println("Треуг. не может существовать(a=$a; b=$b; c=$c)")                                                  //Условие не выполн (c>a+b или c>a+b)


}

