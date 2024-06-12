package leetcodes

import kotlin.math.min

fun commonChars(words: Array<String>): List<String> {
    val map = Array(26) { 0 }
    val lastMap = Array(26) { Int.MAX_VALUE }
    words.forEach {
        it.forEach { map[it.code - 'a'.code]++ }
        lastMap.forEachIndexed { i, v -> lastMap[i] = min(lastMap[i], map[i]) }
        map.fill(0)
    }

    val arr = ArrayList<String>()

    lastMap.forEachIndexed { i, v ->
        repeat(v) {
            arr.add((i + 'a'.code).toChar().toString())
        }
    }

    return arr.toList()
}