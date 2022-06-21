package yajha.solution;

public class P404 {
    int ans=0;
    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root,0);
        return ans;
    }

    public void dfs(TreeNode node,int flag){
        if (node.left==null && node.right==null){
            if (flag==1){
                ans+=node.val;
            }
        }else{
            if (node.left!=null){
                dfs(node.left,1);
            }
            if (node.right!=null){
                dfs(node.right,0);
            }
        }
        return;
    }

}
