package yajha.solution;

public class JZOF_27 {
    public TreeNode mirrorTree(TreeNode root) {
        TreeNode temp=root.left;
        root.left=mirrorTree(root.right);
        root.right=mirrorTree(temp);
        return root;
    }

}
