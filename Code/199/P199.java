package yajha.solution;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class P199 {
    List<Integer> ans=new LinkedList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if (root==null) return ans;
        Deque<TreeNode> deque=new ArrayDeque<>();
        deque.offerLast(root);
        while (!deque.isEmpty()){
            boolean flag=false;
            int len=deque.size();
            for (int i=0;i<len;i++){
                TreeNode t=deque.pollFirst();
                if (t.right!=null) deque.offerLast(t.right);
                if (t.left!=null) deque.offerLast(t.left);
                if (!flag){
                    ans.add(t.val);
                    flag=true;
                }
            }
        }
        return ans;

    }

}
