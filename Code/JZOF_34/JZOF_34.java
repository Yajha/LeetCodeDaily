package yajha.solution;

import java.util.LinkedList;
import java.util.List;

public class JZOF_34 {
    int t=0;
    List<List<Integer>> ans = new LinkedList<>();
    LinkedList<Integer> temp=new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if (root==null) return ans;
        t=target;
        dfs(root,0);
        return ans;
    }

    public void dfs(TreeNode node,int cur){
        cur+=node.val;
        temp.offerLast(node.val);
        if (node.left==null&&node.right==null){
            if (cur==t) {
                ans.add(new LinkedList<>(temp));
            }
            return;
        }
        if (node.left!=null){
            dfs(node.left,cur);
            temp.pollLast();
        }
        if (node.right!=null){
            dfs(node.right,cur);
            temp.pollLast();
        }
    }
}
