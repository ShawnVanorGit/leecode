package list.again;

/**
 * @Author Natasha
 * @Description 设置虚拟头结点！！！
 * @Date 2021/1/11 15:18
 **/
public class 移除链表元素 {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode last = res;
        while(res != null && res.next != null){
            //ps:这里会略过头结点的检查，这就是为什么要设置虚拟头节点原因
            ListNode next = res.next;
            if(next.val == val){
                res.next = next.next;
            }else{
                res = res.next;
            }
        }
        return last.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(6);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(5);
        ListNode g = new ListNode(6);

        ListNode l1 = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = null;

        ListNode list = removeElements(l1, 6);

        while(list != null){
            System.out.printf(list.val + "->");
            list = list.next;
        }
    }
}
