package yajha.solution;

import javafx.util.Pair;

import java.util.*;

public class P144 {

//    List<Integer> ans=new LinkedList<>();
//
//    public List<Integer> preorderTraversal(TreeNode root) {
//        dfs(root);
//        return ans;
//    }
//
//    public void dfs(TreeNode node){
//        if (node==null) return;
//        ans.add(node.val);
//        dfs(node.left);
//        dfs(node.right);
//    }


//    List<Integer> ans=new LinkedList<>();
//
//    public List<Integer> preorderTraversal(TreeNode root) {
//        Deque<Pair<TreeNode,Integer>> deque=new ArrayDeque<>();
//        deque.offer(new Pair<>(root,0));
//        while (!deque.isEmpty()){
//            TreeNode node=deque.getLast().getKey();
//            int mark=deque.getLast().getValue();
//            deque.removeLast();
//            if (node==null) continue;
//            if (mark == 0) {
//                deque.offerLast(new Pair<>(node.right,0));
//                deque.offerLast(new Pair<>(node.left,0));
//                deque.offerLast(new Pair<>(node,1));
//            }else{
//                ans.add(node.val);
//            }
//        }
//        return ans;
//    }

    List<Integer> ans=new LinkedList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root==null) return ans;
        Deque<TreeNode> deque=new ArrayDeque<>();
        deque.offerLast(root);
        while (!deque.isEmpty()){
            TreeNode node=deque.removeLast();
            ans.add(node.val);
            if (node.right!=null) deque.offerLast(node.right);
            if (node.left!=null) deque.offerLast(node.left);

        }
        return ans;
    }
}
