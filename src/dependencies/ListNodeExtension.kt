package dependencies

class ListNodeBuilder {

    var head: ListNode? = null
    var now: ListNode? = null

    fun clear() {
        head = null
        now = null
    }

    fun append(value: Int = 0): ListNodeBuilder {
        if (head == null) {
            head = ListNode(value)
            now = head
        } else {
            now!!.next = ListNode(value)
            now = now!!.next
        }

        return this
    }

    fun build(): ListNode? {
        return head
    }
}

fun ListNode.forEach(func: (Int) -> Unit) {
    tailrec fun applyThis(node: ListNode?) {
        if (node != null) {
            func(node.`val`)
            applyThis(node.next)
        }
    }
    applyThis(this)
}

fun <InitialType> ListNode.folder(
    initialValue: InitialType,
    func: (InitialType, ListNode) -> InitialType
): InitialType {

    var returnValue = initialValue

    tailrec fun applyThis(thisNode: ListNode?) {
        if (thisNode != null) {
            returnValue = func(returnValue, thisNode)
            applyThis(thisNode.next)
        }
    }
    applyThis(this)

    return returnValue
}

fun Int.toReverseListNode(): ListNode {
    var thisVal = this
    val builder = ListNodeBuilder()

    while (thisVal != 0) {
        builder.append(thisVal % 10)
        thisVal /= 10
    }

    return builder.build() ?: ListNode(0)
}

fun ListNode.ToString(): String {
    var result = ""
    this.forEach { value -> result += "$value" }
    return result
}

fun listNodeOf(vararg args: Int): ListNode? {
    val builder = ListNodeBuilder()
    args.forEach { builder.append(it) }
    return builder.build()
}

fun ListNode.size(): Int {
    var length = 0
    this.forEach { length++ }
    return length
}