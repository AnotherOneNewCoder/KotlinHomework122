import java.util.Scanner

fun main() {
    val userInput = Scanner(System.`in`)
    while (true) {
        val likes = userInput.nextInt();
        if (likes < 1) {
            println("Лайков нет")
        } else if (likes.toString().endsWith("1"))
            println("Понравилось $likes человеку")
        else
            println("Понравилось $likes людям")
    }
}