package tree.again;

import java.util.*;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/13 14:19
 **/
public class 二叉树的层序遍历II {
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(queue.size() != 0){
            int size = queue.size();
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                l.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            list.add(0, l);
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(3);
        TreeNode a11 = new TreeNode(9);
        TreeNode a12 = new TreeNode(20);
        a1.left = a11;
        a1.right = a12;
        TreeNode c11 = new TreeNode(15);
        TreeNode c12 = new TreeNode(7);
        a12.left = c11;
        a12.right = c12;

        List<List<Integer>> list = levelOrderBottom(a1);
        for(int i = 0 ;i < list.size() ;i++){
            list.get(i).stream().forEach(System.out::print);
            System.out.println();
        }
    }
}
