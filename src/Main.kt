import dependencies.*

fun printProvider(function: (Array<out Any>) -> String, vararg args: Any) {
    println(function(args))
}

fun main() {
}