import java.util.Scanner
fun main()
{
    var read = Scanner(System.`in`)
    println("enter first value:")
    var firstno = read.nextInt()

    println("enter second value:")
    var secondno = read.nextInt()

    var add =  firstno +  secondno
    println("addition is :$add")

    var sub =  firstno -  secondno
    println("substraction is :$sub")

    var mul =  firstno *  secondno
    println("addition is :$mul")

    var div =  firstno /  secondno
    println( "addition is :$div")
}