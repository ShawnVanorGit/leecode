package tree.again;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 要求是原址修改，即要直接利用这些已经存在的节点空间，修改这些节点的指向来得到单向链表。
 * 不要root.left = null这句代码的话会造成循环的，画图就一目了然了
 * 或者可以理解为root.left需要置空
 */
public class BiNode {
    static TreeNode node = new TreeNode(-1);
    static TreeNode pre = node;
    public static TreeNode convertBiNode(TreeNode root) {
        convertBiNodeTree(root);
        return pre.right;
    }
    public static void convertBiNodeTree(TreeNode root) {
        if(root == null){
            return ;
        }
        convertBiNode(root.left);
        node.right = root;
        node = root;
//        root.left = null;
        convertBiNode(root.right);
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(4);
        TreeNode a11 = new TreeNode(2);
        TreeNode a12 = new TreeNode(5);
        a1.left = a11;
        a1.right = a12;
        TreeNode b11 = new TreeNode(1);
        TreeNode b12 = new TreeNode(3);
        a11.left = b11;
        a11.right = b12;
        TreeNode c = new TreeNode(6);
        TreeNode d = new TreeNode(0);
        b11.left = d;
        a12.right = c;
        TreeNode node = convertBiNode(a1);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        System.out.println("[ "+ node.val+"]");
        while(queue.size() != 0){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode tn = queue.poll();
                if(tn.left != null){
                    queue.add(tn.left);
                    System.out.printf("["+ tn.left.val+", ");
                }else if(tn.left == null){
                    System.out.printf("[null, ");
                }
                if(tn.right != null){
                    queue.add(tn.right);
                    System.out.printf(tn.right.val+"]");
                }else if(tn.right == null){
                    System.out.printf("null]");
                }
            }
            System.out.println();
        }
    }
}
