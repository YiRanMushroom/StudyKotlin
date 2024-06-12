import dependencies.*
import java.util.function.Function

fun <T> Array<T>.changeEach(function: (T) -> T) {
    this.forEachIndexed { index, value -> this[index] = function(value) }
}

fun <R> invokeInt(`val`: Int, func: Function<Int, R>): R {
    return func.apply(`val`)
}

fun main() {
    var s1 = ""
    var s2 = ""
    s1 = readln()
    s2 = readln()
    if (s1 == s2) println("s1 and s2 are the same")
    repeat(4) { println(it) }
}