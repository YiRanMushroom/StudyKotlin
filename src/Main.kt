import dependencies.*

fun <T> Array<T>.changeEach(function: (T) -> T){
    this.forEachIndexed{index, value -> this[index] = function(value)}
}

fun main() {
}