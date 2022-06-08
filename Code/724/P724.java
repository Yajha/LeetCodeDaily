package yajha.solution;

import java.util.Arrays;

public class P724 {

    public int pivotIndex(int[] nums) {
        int len=nums.length;
        int sum= Arrays.stream(nums).sum();
        int t=0;
        for (int i=0;i<len;i++){
            if (t*2==sum-nums[i]){
                return i;
            }
            t+=nums[i];
        }
        return -1;
    }

}
