package yajha.solution;

import java.util.LinkedList;
import java.util.List;

public class P303 {

    List<Integer> sum=new LinkedList<>();
    public void NumArray(int[] nums) {
        int t=0;
        for (int i=0;i<nums.length;i++){
            t+=nums[i];
            sum.add(t);
        }
    }

    public int sumRange(int left, int right) {
        return left==0?sum.get(right):sum.get(right)-sum.get(left-1);
    }

}
