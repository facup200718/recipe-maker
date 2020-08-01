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

    var cadena: String? = null
    var cantLetras: Int = cadena?.length ?: 0
    println("La cadena mide $cantLetras de largo")

    var listWithNulls : List<Int?> = listOf<Int?> (8,null,4,2,null)
    var listWithoutNulls = listWithNulls.filterNotNull()
    for (n in listWithoutNulls) {
        println(n)
    }
}
