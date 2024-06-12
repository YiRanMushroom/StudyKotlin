package leetcodes

import kotlin.math.max

fun lengthOfLongestSubstring(s: String): Int {
    if (s.isEmpty()) return 0
    var maxLength = 1
    val set = HashSet<Char>()
    set.add(s[0])

    var left = 0
    var right = 0
    while (right < s.length - 1) {
        if (set.contains(s[right + 1])) {
            set.remove(s[left])
            left++
        } else {
            right++
            set.add(s[right])
        }
        maxLength = max(right - left + 1, maxLength)
    }

    return maxLength
}