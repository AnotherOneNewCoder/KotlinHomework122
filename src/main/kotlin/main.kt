import java.util.Scanner

fun main() {
    val userInput = Scanner(System.`in`)
    while (true) {
        println("Введите число лайков: ")
        val likes = userInput.nextInt();
        val exit = "exit"
        if (likes < 1)
            println("Лайков нет")
        else if (likes.toString().endsWith("11"))
            println("Понравилось $likes людям")
        else if (likes.toString().endsWith("1"))
            println("Понравилось $likes человеку")
        else if (likes.toString().equals(exit))
            break
        else
            println("Понравилось $likes людям")
    }
}