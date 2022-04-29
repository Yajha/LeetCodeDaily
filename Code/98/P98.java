package yajha.solution;

import java.util.LinkedList;
import java.util.List;

public class P98 {

    List<Integer> ans=new LinkedList<>();

    public boolean isValidBST(TreeNode root){
        dfs(root);
        for (int i=0;i<ans.size()-1;i++){
            if (ans.get(i)>ans.get(i+1)){
                return false;
            }
        }
        return true;
    }

    void dfs(TreeNode node){
        if (node==null){
            return;
        }
        dfs(node.left);
        ans.add(node.val);
        dfs(node.right);
    }

}
