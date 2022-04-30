package yajha.solution;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class P173 {

    List<Integer> res = new LinkedList<>();
    int idx=-1;
    public P173(TreeNode root) {
        inOrderTraversal(root);
        System.out.println(res.toString());
    }

    public int next() {
        idx+=1;
        return res.get(idx);
    }

    public boolean hasNext() {
        return idx<res.size()-1;
    }

    public void inOrderTraversal(TreeNode root) {
        Deque<TreeNode> deque=new ArrayDeque<>();
        TreeNode node=root;
        while (!deque.isEmpty() || node!=null) {
            while (node != null) {
                deque.offerLast(node);
                node = node.left;
            }
            node=deque.removeLast();
            res.add(node.val);
            node=node.right;

        }
    }

}
