package yajha.solution;

import java.util.HashSet;
import java.util.Set;

public class P128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet=new HashSet<>();
        for (int num:nums){
            numSet.add(num);
        }
        int ans=0;
        for (int num:numSet){
            if (!numSet.contains(num)){
                int curLen=1;
                int temp=num;
                while (numSet.contains(temp+1)){
                    curLen++;
                    temp++;
                }
                ans=Math.max(ans,curLen);
            }
        }
        return ans;
    }
}
