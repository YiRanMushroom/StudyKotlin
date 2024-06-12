package leetcodes

import dependencies.ListNode
import dependencies.ListNodeBuilder
import dependencies.forEach
import dependencies.size

fun removeNthFromEnd(head: ListNode, n: Int): ListNode? {
    val builder = ListNodeBuilder()
    var position = 0
    val size = head.size()
    head.forEach {
        position++
        if (position != size - n + 1) builder.append(it)
    }
    return builder.build()
}