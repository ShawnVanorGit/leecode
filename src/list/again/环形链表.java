package list.again;


/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/8 17:03
 **/
public class 环形链表 {
    public static boolean hasCycle(ListNode head) {
        ListNode low = head;
        ListNode fast = head;
        if(head == null || head.next == null){
            return false;
        }
        while(low != null && low.next != null){
            low = low.next;
            fast = fast.next.next;
            if(low == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(0);
        ListNode d = new ListNode(-4);

        ListNode head = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;

        boolean aaa = hasCycle(head);
        System.out.printf(String.valueOf(aaa));
    }
}
