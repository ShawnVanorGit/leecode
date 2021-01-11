package list;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/9 11:04
 **/
public class 回文链表 {
    public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode low = head;
        ListNode fast = head;
        ListNode tmp = head;
        while(fast != null && fast.next != null){
            low = low.next;
            fast = fast.next.next;
            if(fast == null){
                head.next = null;
                return eq(reverse(low), tmp);
            } else if(fast.next == null){
                head.next = null;
                return eq(reverse(low.next), tmp);
            }
            head = head.next;
        }
        return false;
    }

    public static ListNode reverse(ListNode node){
        ListNode tmp = null;
        ListNode next;
        while(node != null){
            next = node.next;
            node.next = tmp;

            tmp = node;
            node = next;
        }
        return tmp;
    }

    public static boolean eq(ListNode l1, ListNode l2){
        while(l1.val ==  l2.val){
            l1 = l1.next;
            l2 = l2.next;
            if(l1 == null && l2 == null){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode f = new ListNode(3);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(1);


        ListNode l1 = a;
        a.next = b;
        b.next = f;
        f.next = c;
        c.next = d;
        d.next = null;

        boolean list = isPalindrome(l1);

        System.out.println(list);
    }
}
