package leetcodes

fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
    val map = HashMap<Int, Int>()

    for (index in arr2.indices) {
        map[arr2[index]] = index
    }

    return arr1.sortedBy { if (map.containsKey(it)) map[it] else 2000 + it }.toIntArray()
}