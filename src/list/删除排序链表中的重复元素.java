package list;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/11 15:12
 **/
public class 删除排序链表中的重复元素 {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode res = head;
        while(head != null && head.next != null){
            ListNode next = head.next;
            if(head.val == next.val){
                head.next = next.next;
            }else{
                head = head.next;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        ListNode f = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(3);


        ListNode l1 = a;
        a.next = b;
        b.next = f;
        f.next = c;
        c.next = d;
        d.next = null;

        ListNode list = deleteDuplicates(l1);

        while(list != null){
            System.out.printf(list.val + "->");
            list = list.next;
        }
    }
}
