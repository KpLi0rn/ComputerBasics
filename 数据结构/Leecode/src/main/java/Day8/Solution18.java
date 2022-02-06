package Day8;

public class Solution18 {

    public static void main(String[] args) {
        ListNode list = new ListNode(-1),p = list;
        int[] nums = new int[]{1,2,2,2,3};
        for (int num:nums){
            p.next = new ListNode(num);
            p = p.next;
        }

        ListNode res = new Solution18().deleteDuplicates(list.next);
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

    public ListNode deleteDuplicates(ListNode head) {
        /**
         * 艹 给的是已排序的啊 ... 那前面的等于后面的话删掉就行了
         * 我这个排序不能处理三个以上 咋整
         */
        ListNode p = head;
        while (p != null && p.next != null){
            // 相邻相等就跳过
            if (p.val == p.next.val){
                p.next = p.next.next; // 1 1 1  -> 1 1 -> 1 null
            }else {
                // 如果不一样再进行移动
                p = p.next;
            }
        }
        return head;
    }
}
