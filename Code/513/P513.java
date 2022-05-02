package yajha.solution;

import javafx.util.Pair;

import java.util.ArrayDeque;
import java.util.Deque;

public class P513 {




    public int findBottomLeftValue(TreeNode root) {

        Deque<Pair<TreeNode,Integer>> deque=new ArrayDeque<>();
        deque.offerLast(new Pair<>(root,1));
        int depth=0,ans=0;
        while (!deque.isEmpty()){
            Pair<TreeNode,Integer> temp=deque.removeFirst();
            TreeNode node=temp.getKey();
            Integer val=temp.getValue();
            if (val>depth) {
                depth=val;
                ans=node.val;
            }
            if (node.left!=null) deque.offerLast(new Pair<>(node.left,val+1));
            if (node.right!=null) deque.offerLast(new Pair<>(node.right,val+1));
        }
        return ans;
    }

}
