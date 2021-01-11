package list;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/11 15:46
 **/
public class 二进制链表转整数 {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null){
            sb.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}
