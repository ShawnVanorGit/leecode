package list;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/11 9:32
 **/
public class 从尾到头打印链表 {
    public int[] reversePrint(ListNode head) {
        ListNode tmp = null;
        int cnt = 0;
        while(head != null){
            ListNode next = head.next;
            head.next = tmp;
            tmp = head;
            head = next;
            cnt++;
        }
        int[] res= new int[cnt];
        int i = 0;
        while(tmp != null){
            res[i++] = tmp.val;
            tmp = tmp.next;
        }
        return res;
    }
}
