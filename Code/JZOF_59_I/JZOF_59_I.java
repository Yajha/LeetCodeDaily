package yajha.solution;

import javafx.util.Pair;

import java.util.ArrayDeque;
import java.util.Deque;

public class JZOF_59_I {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len=nums.length;
        if (len==0) return new int[]{};
        int ans[]=new int[len-k+1];
        Deque<Pair<Integer,Integer>> deque=new ArrayDeque<>();
        for (int i=0;i<k;i++){
            while (!deque.isEmpty() && deque.peekLast().getValue()<=nums[i]){
                deque.pollLast();
            }
            deque.offerLast(new Pair<>(i,nums[i]));
        }
        ans[0]=deque.peekFirst().getValue();
        for (int i=k;i<len;i++){
            while (!deque.isEmpty() && deque.peekLast().getValue()<nums[i]){
                deque.pollLast();
            }
            deque.offerLast(new Pair<>(i,nums[i]));
            while (deque.peekFirst().getKey()<=i-k){
                deque.pollFirst();
            }
            ans[i-k+1]=deque.peekFirst().getValue();

        }

        return ans;


    }
}
