package yajha.solution;

import java.util.LinkedList;
import java.util.Queue;


public class P104 {
    public int maxDepth(TreeNode root) {
        if (root==null) return 0;
        int left,right;
        left=maxDepth(root.left)+1;
        right=maxDepth(root.right)+1;
        return Math.max(left,right);
    }
//    public int maxDepth(TreeNode root) {
//        if (root==null){
//            return 0;
//        }
//        Queue<TreeNode> queue=new LinkedList<TreeNode>();
//        queue.offer(root);
//        int ans=0;
//        while (!queue.isEmpty()){
//            int size=queue.size();
//            while (size!=0){
//                TreeNode t=queue.poll();
//                if(t.left!=null){
//                    queue.offer(t.left);
//                }
//                if(t.right!=null){
//                    queue.offer(t.right);
//                }
//                size--;
//            }
//            ans+=1;
//        }
//        return ans;
//    }
}
