package Day7;

/**
 * 快慢指针来解决：追赶问题，如果遇到了那么就说明有环如果遇不到那么就说明没有环
 * slow 跑一格 fast 跑两格
 */
public class Solution14 {
    public static void main(String[] args) {

    }

     class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head,fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }


}
