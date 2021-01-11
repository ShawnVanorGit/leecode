package list;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/11 15:31
 **/
public class 删除中间节点 {
    public void deleteNode(ListNode node) {
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
    }
}
