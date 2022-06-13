package yajha.solution;

public class JZOF_26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null||B==null){
            return false;
        }
        return dfs(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B);
    }

    public boolean dfs(TreeNode a,TreeNode b){
        if (b==null){
            return true;
        }else if (a==null){
            return false;
        }
        if (a.val==b.val){
            return dfs(a.left,b.left)&&dfs(a.right,b.right);
        }else{
            return false;
        }
    }

}
