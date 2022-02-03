package Day7;

public class Solution16 {
    public static void main(String[] args) {
        // 链表赋值需要另一个指针，一个的话链表就会到最后
        ListNode head = new ListNode(-1),p=head;
        int[] list = new int[]{1,2,6,3,4,5,6};
//        int[] list = new int[]{1,1,1,1,1};

        for (int num:list){
            p.next = new ListNode(num);
            p = p.next;
        }
        ListNode res = new Solution16().removeElements(head.next,6);
        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeElements(ListNode head, int val) {
        // 不需要创建一个
        ListNode temp = new ListNode(-1);
        temp.next = head; // 避免第一个就是 -1 的情况
        ListNode p1 = temp;
        while (p1.next != null){
            if (p1.next.val == val){
                p1.next = p1.next.next;
            }else {
                p1 = p1.next; // 链表移动
            }
        }
        return temp.next;
    }
}
