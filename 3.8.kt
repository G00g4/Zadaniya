import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    println("ВВедите x=")
    val x = scanner.nextInt()
    println("ВВедите y=")
    val y = scanner.nextInt()
    if (x>0 && y>0) println("Точка находится в 1й четверти (x=$x; y=$y)")                   //  x>0 и y<0
    else if (x>0 && y<0) println("Точка находится в 4й четверти (x=$x; y=$y)")              //  x>0 и y<0
        else if (x<0 && y>0) println("Точка находится в 2й четверти (x=$x; y=$y)")          //  x<0 и y>0
            else if (x<0 && y<0) println("Точка находится в 3й четверти (x=$x; y=$y)")      //  x<0 и y<0
    if (x==0)
        if (y==0) println("Точка находится в начале коорд. (x=$x; y=$y)")                   //  x=0 и y=0
        else if (y>0) println("Точка находится на оси y (x=$x; y=$y)")                      //  x=0 и y>0
            else println("Точка находится на оси y (x=$x; y=$y)")                  //  x=0 и y<0
    if (y==0)
        if (x>0) println("Точка находится оси x (x=$x; y=$y)")                  //  x>0 и y=0
        else if (x<0) println("Точка находится оси x (x=$x; y=$y)")             //  x<0 и y=0
}

