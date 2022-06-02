package yajha.solution;

import java.util.HashSet;
import java.util.Set;

public class P219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len=nums.length;
        if (k>=len){
            k=len-1;
        }
        Set<Integer> numSet=new HashSet<>();
        int cur=k;
        for (int i=0;i<=k;i++){
            if (!numSet.add(nums[i])){
                return true;
            }
        }
        for (cur=k+1;cur<len;cur++){
            numSet.remove(nums[cur-k-1]);
            if (!numSet.add(nums[cur])){
                return true;
            }
        }
        return false;
    }

}
