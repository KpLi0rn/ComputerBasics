package Day7;

public class Solution15 {

    public static void main(String[] args) {

    }

    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 虚拟头节点
        ListNode dummy = new ListNode(-1), p = dummy;
        ListNode p1 = list1;
        ListNode p2 = list2;
        // 变成升序
        while (p1 != null && p2 != null){
            if (p1.val > p2.val){
                p.next = p2;
                p2 = p2.next;
            }else {
                p.next = p1;
                p1 = p1.next;
            }
            p = p.next; // p 要不断的移动
        }

        // 一个已经弄完了另一个链表还剩下一个的情况
        if (p1 != null){
            p.next = p1;
        }

        if (p2 != null){
            p.next = p2;
        }

        return dummy.next; // 去掉头节点
    }

}
