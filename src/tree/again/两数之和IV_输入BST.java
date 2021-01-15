package tree.again;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Natasha
 * @Description 利用二叉搜索树BST+双指针
 * @Date 2021/1/15 8:30
 **/
public class 两数之和IV_输入BST {
    static List<Integer> list = new ArrayList<>();
    public static boolean findTarget(TreeNode root, int k) {
        findTargetTree(root);
        int qian = 0;
        int hou = list.size() - 1;
        while(qian < hou){
            int tmp =list.get(qian) + list.get(hou);
            if(tmp > k){
                hou--;
            }else if(tmp < k){
                qian++;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void findTargetTree(TreeNode root) {
        if(root == null){
            return;
        }
        findTargetTree(root.left);
        list.add(root.val);
        findTargetTree(root.right);
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(5);
        TreeNode a11 = new TreeNode(3);
        TreeNode a12 = new TreeNode(6);
        a1.left = a11;
        a1.right = a12;
        TreeNode b11 = new TreeNode(2);
        TreeNode b12 = new TreeNode(4);
        a11.left = b11;
        a11.right =b12;
        TreeNode c = new TreeNode(7);
        a12.right = c;
        boolean flag = findTarget(a1, 9);
        System.out.println(flag);
    }
}
