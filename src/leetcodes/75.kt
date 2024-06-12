package leetcodes

fun sortColors(nums: IntArray): Unit {
    val map : IntArray = intArrayOf(0,0,0)
    nums.forEach { map[it]++ }

    var index = 0
    var at = 0
    map.forEach { for(i in 0 until it) nums[index++] = at; at++}
}