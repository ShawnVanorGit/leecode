package list;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/11 9:14
 **/
public class 链表中倒数第k个节点 {
    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode low = head;
        ListNode fast = head;
        for (int i = 0; i < k; i++){
            fast = fast.next;
        }
        while(fast != null){
            low = low.next;
            fast = fast.next;
        }
        return low;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode f = new ListNode(3);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(5);


        ListNode l1 = a;
        a.next = b;
        b.next = f;
        f.next = c;
        c.next = d;
        d.next = null;

        ListNode list = getKthFromEnd(l1, 2);

        while(list != null){
            System.out.printf(list.val + "->");
            list = list.next;
        }
    }
}
