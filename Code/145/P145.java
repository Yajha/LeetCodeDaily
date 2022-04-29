package yajha.solution;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class P145 {

    List<Integer> ans=new LinkedList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root==null) return ans;
        Deque<TreeNode> deque=new ArrayDeque<>();
        TreeNode node=root;
        TreeNode prev=null;
        while (!deque.isEmpty() || node!=null){
            while (node != null){
                deque.offerLast(node);
                node=node.left;
            }
            node=deque.removeLast();
            if (node.right==null||node.right==prev){
                ans.add(node.val);
                prev=node;
                node=null;
            }else{
                deque.offerLast(node.right);
                node=node.right;
            }
        }
        return ans;
    }

}
