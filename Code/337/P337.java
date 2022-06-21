package yajha.solution;

import java.util.Arrays;

public class P337 {


    public int rob(TreeNode root) {
        return Arrays.stream(dfs(root)).max().getAsInt();
    }

    public int[] dfs(TreeNode node){
        int[] res=new int[]{0,0};
        if (node==null) return res;
        int[] left=dfs(node.left);
        int[] right=dfs(node.right);
        int res1=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        int res2=left[0]+node.val+right[0];
        return new int[]{res1,res2};

    }

}
