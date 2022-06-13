package yajha.solution;

public class JZOF_54 {
    int cur=0;
    int ans=0;
    public int kthLargest(TreeNode root, int k) {
        cur=k-1;
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode node){
        if (node==null) return;
        dfs(node.right);
        if (cur==0) {
            ans=node.val;
        }
        cur--;
        dfs(node.left);
    }

}
