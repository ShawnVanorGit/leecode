package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/14 19:36
 **/
public class 二叉树的层平均值 {
    public static List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Double> res = new ArrayList<>();
        while(queue.size() > 0){
            int size = queue.size();
            long tmp = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                tmp+=node.val;
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            res.add(tmp * 1.0/ size );
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(3);
        TreeNode a11 = new TreeNode(9);
        TreeNode a12 = new TreeNode(20);
        a1.left = a11;
        a1.right = a12;
        TreeNode b11 = new TreeNode(15);
        TreeNode b12 = new TreeNode(7);
        a12.left = b11;
        a12.right = b12;
        averageOfLevels(a1).stream().forEach(System.out::println);
    }
}
