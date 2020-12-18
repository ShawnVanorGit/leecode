package list;

import java.util.LinkedList;

/**
 * @Author Natasha
 * @Description
 * @Date 2020/12/15 8:51
 **/
public class 反转链表 {
    public static ListNode reverseList(ListNode head) {
        ListNode tmp = null;
        while(head != null){
            ListNode next = head.next;
            head.next = tmp;
            tmp = head;
            head = next;
        }
        return tmp;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);

        ListNode head = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        ListNode res = reverseList(head);

        while(res != null){
            System.out.printf(res.val + "->");
            res = res.next;
        }
        System.out.printf("null");
    }
}
