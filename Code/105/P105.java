package yajha.solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return dfs(preorder,inorder);
    }

    public TreeNode dfs(int[] preorder,int[] inorder){
        int val=preorder[0];
        int idxInorder=0;
        for (int i=0;i<inorder.length;i++){
            if (inorder[i]==val){
                idxInorder=i;
                break;
            }
        }
        TreeNode node=new TreeNode(val);
        if (idxInorder!=0){
            node.left=dfs(Arrays.copyOfRange(preorder,1,idxInorder+1),Arrays.copyOfRange(inorder,0,idxInorder));
        }
        if (idxInorder!=inorder.length-1){
            node.right=dfs(Arrays.copyOfRange(preorder,idxInorder+1,preorder.length),Arrays.copyOfRange(inorder,idxInorder+1,preorder.length));
        }

        return node;
    }
}
