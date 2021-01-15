package tree;

/**
 * @Author Natasha
 * @Description
 * @Date 2021/1/14 17:20
 **/
public class 根据二叉树创建字符串 {
    static StringBuilder sb = new StringBuilder();
    public static String tree2str(TreeNode t) {
        if(t == null){
            return sb.toString();
        }
        sb.append(t.val);
        tree2strTree(t);
        return sb.toString();
    }
    public static void tree2strTree(TreeNode t) {
        if(t == null){
            return;
        }
        if(t.left == null && t.right != null){
            sb.append("()");
        }
        if(t.left != null){
            sb.append("(").append(t.left.val);
            tree2strTree(t.left);
            sb.append(")");
        }
        if(t.right != null){
            sb.append("(").append(t.right.val);
            tree2strTree(t.right);
            sb.append(")");
        }
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a11 = new TreeNode(2);
        TreeNode a12 = new TreeNode(3);
        a1.left = a11;
        a1.right = a12;
        TreeNode b = new TreeNode(4);
        a11.left = b;
        System.out.println(tree2str(a1));
    }
}
