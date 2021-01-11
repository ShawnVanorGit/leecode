package list;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/8 15:16
 **/
public class 合并两个有序链表 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode head = listNode;
        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                listNode.next = l2;
                l2 = l2.next;
            } else {
                listNode.next = l1;
                l1 = l1.next;
            }
            listNode = listNode.next;
        }
        while(l1 != null){
            listNode.next = l1;
            listNode = listNode.next;
            l1 = l1.next;
        }
        while(l2 != null){
            listNode.next = l2;
            listNode = listNode.next;
            l2 = l2.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(4);

        ListNode d = new ListNode(1);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(4);


        ListNode l1 = a;
        a.next = b;
        b.next = c;
        c.next = null;

        ListNode l2 = d;
        d.next = e;
        e.next = f;
        f.next = null;

        ListNode list = mergeTwoLists(l1, l2);

        while(list != null){
            System.out.printf(list.val + "->");
            list = list.next;
        }
    }
}
