package list;

public class 合并两个有序链表 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(1);
        ListNode res = l;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                l.next = l1;
                l1 = l1.next;
            }else{
                l.next = l2;
                l2 = l2.next;
            }
            l = l.next;
        }
        while (l1 != null){
            l.next = l1;
            l = l.next;
            l1 = l1.next;
        }
        while (l2 != null){
            l.next = l2;
            l = l.next;
            l2 = l2.next;
        }
        return res.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(-9);
        ListNode b = new ListNode(3);

        ListNode d = new ListNode(5);
        ListNode e = new ListNode(7);

        ListNode l1 = a;
        a.next = b;
        b.next = null;

        ListNode l2 = d;
        d.next = e;
        e.next = null;

        ListNode res = mergeTwoLists(l1, l2);

        while(res != null){
            System.out.printf(res.val + "->");
            res = res.next;
        }
        System.out.printf("null");
    }

}
