package tree.unknow;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/14 14:00
 **/
public class 二叉搜索树中的众数_使用Morris中序遍历把空间复杂度优化到O1 {
    static TreeNode pre;
    static int tmp;
    static int cnt = 1;
    static int cntMax = 0;
    static List<Integer> res = new LinkedList<>();
    public static int[] findMode(TreeNode root) {
        findModeTree(root);
        return res.stream().mapToInt(Integer::valueOf).toArray();

    }
    public static void findModeTree(TreeNode root) {
        if(root == null){
            return;
        }
        findModeTree(root.left);
        if(pre != null && pre.val == root.val){
            cnt ++;
        }else {
            cnt = 1;
        }
        if(cntMax < cnt){
            res.clear();
            cntMax = cnt;
            res.add(root.val);
        }else if(cntMax == cnt){
            res.add(root.val);
        }
        pre = root;
        tmp = pre.val;
        findModeTree(root.right);
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a11 = new TreeNode(2);
        TreeNode a12 = new TreeNode(2);

        a1.right = a11;
        a11.right = a12;
        Arrays.stream(findMode(a1)).forEach(System.out::println);
    }
}
