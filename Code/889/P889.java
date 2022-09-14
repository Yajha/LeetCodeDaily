package yajha.solution;

import java.util.Arrays;

public class P889 {
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return dfs(preorder,postorder);
    }

    public int findIdx(int[] arr,int val){
        int idx=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==val){
                idx=i;
                break;
            }
        }

        return idx;
    }
    public TreeNode dfs(int[] preorder,int[] postorder) {
        if (preorder.length == 1) {
            return new TreeNode(preorder[0]);
        }
        int val = preorder[0];
        int idxPostOrder = findIdx(postorder, val);

        int val2 = preorder[1];
        int idxPostOrder2 = findIdx(postorder, val2);//length of left

        TreeNode node = new TreeNode(val);
        node.left = dfs(Arrays.copyOfRange(preorder, 1, idxPostOrder2 + 1 + 1), Arrays.copyOfRange(postorder, 0, idxPostOrder2 + 1));

        if (idxPostOrder2 != idxPostOrder - 1) {
            node.right = dfs(Arrays.copyOfRange(preorder, idxPostOrder2 + 1 + 1, preorder.length), Arrays.copyOfRange(postorder, idxPostOrder2 + 1, postorder.length - 1));
        }

        return node;
    }
}
