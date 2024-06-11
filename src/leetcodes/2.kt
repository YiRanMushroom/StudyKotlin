package leetcodes

import dependencies.ListNode
import dependencies.ListNodeBuilder
import dependencies.folder
import dependencies.toReverseListNode

fun Int.reverse(): Int {
    var thisVal = this
    var returnVal = 0
    while (thisVal != 0) {
        returnVal *= 10
        returnVal += thisVal % 10
        thisVal /= 10
    }

    return returnVal
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode {
    var list1: ListNode? = l1!!
    var list2: ListNode? = l2!!
    var shouldAddOne = false
    val builder = ListNodeBuilder()

    while (list1 != null || list2 != null) {
        val thisVal: Int = (if (list1 != null) list1.`val` else 0) +
                (if (list2 != null) list2.`val` else 0) + if (shouldAddOne) 1 else 0
        builder.append(thisVal % 10)
        shouldAddOne = thisVal >= 10
        list1 = list1?.next
        list2 = list2?.next
    }

    if (shouldAddOne) builder.append(1)

    return builder.build()!!
}
