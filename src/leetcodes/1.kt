package leetcodes

import kotlin.collections.HashMap

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()

    for (index in nums.indices) {
        map[nums[index]]?.let { return intArrayOf(index, it) }
        map[target - nums[index]] = index
    }
    return intArrayOf()
}
