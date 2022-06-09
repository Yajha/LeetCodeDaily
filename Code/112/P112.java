package yajha.solution;

import apple.laf.JRSUIUtils;

public class P112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root==null){
            return false;
        }
        return dfs_helper(root,0,targetSum);
    }

    public boolean dfs_helper(TreeNode node,int curSum,int targetSum){
        if (node.left==null&&node.right==null){
            if (curSum+node.val==targetSum){
                return true;
            }else{
                return false;
            }
        }
        if (node.left==null){
            return dfs_helper(node.right,curSum+node.val,targetSum);
        }else if (node.right==null){
            return dfs_helper(node.left,curSum+node.val,targetSum);
        }else {
            return dfs_helper(node.left,curSum+node.val,targetSum) || dfs_helper(node.right,curSum+node.val,targetSum);
        }
    }


}
