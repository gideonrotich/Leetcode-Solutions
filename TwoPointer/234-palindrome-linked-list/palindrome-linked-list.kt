/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun isPalindrome(head: ListNode?): Boolean {
         var slow = head
    var fast = head
    // Find the middle of the linked list
    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
    }
    // Reverse the second half of the linked list
    var prev: ListNode? = null
    var current = slow
    while (current != null) {
        val nextTemp = current.next
        current.next = prev
        prev = current
        current = nextTemp
    }
    // Compare the first half and reversed second half
    var firstHalf = head
    var secondHalf = prev
    while (secondHalf != null) {
        if (firstHalf?.`val` != secondHalf.`val`) {
            return false
        }
        firstHalf = firstHalf.next
        secondHalf = secondHalf.next
    }
    return true
    }
}