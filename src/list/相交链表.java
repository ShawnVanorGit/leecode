package list;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/11 9:43
 **/
public class 相交链表 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode HA = headA;
        ListNode HB = headB;
        while(headA != headB){
            if(headA == null){
                headA = HB;
            } else if(headB == null){
                headB = HA;
            } else{
                headA = headA.next;
                headB = headB.next;
            }
        }
        return headA;
    }
}
