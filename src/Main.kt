import java.lang.NullPointerException

fun main(args: Array<String>) {
    try {
        var compute: String?
        compute = null
        var longitud: Int = compute!!.length
    } catch (e: NullPointerException) {
        println("Ingresa un valor, no aceptamos valores nulos")
    }
}
