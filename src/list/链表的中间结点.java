package list;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/11 9:35
 **/
public class 链表的中间结点 {
    public static ListNode middleNode(ListNode head) {
        ListNode low = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            low = low.next;
            fast = fast.next.next;
        }
        return low;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode f = new ListNode(3);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(6);


        ListNode l1 = a;
        a.next = b;
        b.next = f;
        f.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        ListNode list = middleNode(l1);

        while(list != null){
            System.out.printf(list.val + "->");
            list = list.next;
        }
    }
}
