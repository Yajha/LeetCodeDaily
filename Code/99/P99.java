package yajha.solution;

public class P99 {
    TreeNode prev=null;
    TreeNode p=null,q=null;
    public void recoverTree(TreeNode root) {
        inOrder(root);
        int te=p.val;
        p.val=q.val;
        q.val=te;
    }

    public void inOrder(TreeNode node){
        if (node==null) return;
        inOrder(node.left);
        if (prev==null) {
            prev = node;
        }else{
//            System.out.println(node.val);
//            System.out.println(prev.val);
            if (node.val<prev.val){
                p=node;
                //有两队错误，只需记录第一队中prev的值
                if (q==null){
                    q=prev;
                }

            }
            prev=node;
        }
        inOrder(node.right);

    }

}
