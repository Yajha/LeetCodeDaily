package yajha.solution;

import javafx.util.Pair;

import java.util.*;

public class P107 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        Deque<Pair<TreeNode,Integer>> deque=new ArrayDeque<>();
        List<Integer> curLevel=new LinkedList<>();
        deque.offerLast(new Pair<>(root,1));
        int depth=0;
        Deque<List<Integer>> ans= new ArrayDeque<>();
        if (root==null) return new LinkedList<>(ans);
        while (!deque.isEmpty()){
            Pair<TreeNode,Integer> temp=deque.removeFirst();
            TreeNode node=temp.getKey();
            Integer val=temp.getValue();
            if (val>depth) {
                depth=val;
                if (!curLevel.isEmpty()) ans.offerFirst(curLevel);
                curLevel=new LinkedList<>(Arrays.asList(node.val));
            }else{
                curLevel.add(node.val);
            }
            if (node.left!=null) deque.offerLast(new Pair<>(node.left,val+1));
            if (node.right!=null) deque.offerLast(new Pair<>(node.right,val+1));
        }
        ans.offerFirst(curLevel);

        return new LinkedList<>(ans);
    }

}
