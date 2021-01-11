package list;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/11 15:34
 **/
public class 移除重复节点 {
    public static ListNode removeDuplicateNodes(ListNode head) {
        ListNode virtulhead = new ListNode(-1);
        virtulhead.next = head;
        ListNode res = virtulhead;
        HashSet<Integer> set = new HashSet<>();
        set.add(virtulhead.val);
        while(head != null && virtulhead.next != null){
            ListNode next = virtulhead.next;
            if(set.contains(next.val)){
                virtulhead.next = next.next;
            } else{
                set.add(next.val);
                virtulhead = virtulhead.next;
            }
        }
        return res.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        ListNode f = new ListNode(1);
        ListNode c = new ListNode(1);
        ListNode d = new ListNode(2);


        ListNode l1 = a;
        a.next = b;
        b.next = f;
        f.next = c;
        c.next = d;
        d.next = null;

        ListNode list = removeDuplicateNodes(l1);

        while(list != null){
            System.out.printf(list.val + "->");
            list = list.next;
        }
    }
}
