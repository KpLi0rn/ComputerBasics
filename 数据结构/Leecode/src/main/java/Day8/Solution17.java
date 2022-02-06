package Day8;


public class Solution17 {
    public static void main(String[] args) {
        ListNode list = new ListNode(-1),p = list;
        int[] nums = new int[]{1,2,3};
        for (int num:nums){
            p.next = new ListNode(num);
            p = p.next;
        }
        ListNode res = new Solution17().reverseList(list.next);
        ListNode p1 = res;
        while (p1 != null){
            System.out.println(p1.val);
            p1 = p1.next;
        }

    }


    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        /**
         * 链表反转，我们不知道链表的长度只能通过next来获取下一个
         * 1,2
         */
        if (head == null || head.next == null ){
            return head;
        }
        ListNode last = reverseList(head.next);
        // 原来 head.next.next = null
        // null -> head (2,1)
        head.next.next = head;
        // 2.next -> null 原来是指向 1 的
        head.next = null;
        return last;
    }
}
