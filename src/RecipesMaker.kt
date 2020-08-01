import java.io.Console
import java.lang.NullPointerException
import java.util.*

fun main (args: Array<String>) {
    showMenu()
    chooseOption()

}

fun showMenu() {
    println(ConsoleColors.WHITE + ":: Bienvenido a Recipe Maker ::\n\n")
    println(ConsoleColors.BLACK+ """Selecciona la opción deseada
1. Hacer una receta
2. Ver mis recetas
3. Salir""".trimIndent() + ConsoleColors.RESET)
}

fun chooseOption() {
    var validado : Boolean? = false
    do {
        val response : String? = readLine()
        when (response) {
            "1" -> {
                makeRecipe()
                validado = true
            }
            "2" -> {
                watchRecipes()
                validado = true
            }
            "3" -> {
                exitRecipeMaker()
                validado = true
            }
            else -> println("Ingrese una opcion válida")
        }
    } while (validado!!.equals(false))

}

fun watchRecipes() {
    println(ConsoleColors.WHITE + ":: Veamos las recetas existentes ::" + ConsoleColors.RESET)
}

fun makeRecipe() {
    println(ConsoleColors.WHITE + ":: Hagamos una receta ::" + ConsoleColors.RESET)
}

fun exitRecipeMaker() {
    println(ConsoleColors.BLACK + ConsoleColors.BLUE_BACKGROUND + ":: ERROR 404 ::" + ConsoleColors.RESET)
}

