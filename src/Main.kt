import java.lang.NullPointerException

fun main(args: Array<String>) {

    var palabra: String? = null
    var largo: Int? = palabra?.length
    println("El largo de la palabra es de: $largo")

    try {
        var compute: String? = null
        var longitud: Int = compute!!.length
    } catch (e: NullPointerException) {
        println("Ingresa un valor, no aceptamos valores nulos")
    }
}
