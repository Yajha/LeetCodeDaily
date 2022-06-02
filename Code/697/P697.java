package yajha.solution;

import java.util.HashMap;
import java.util.Map;

public class P697 {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> first=new HashMap<>();
        Map<Integer,Integer> last=new HashMap<>();
        Map<Integer,Integer> cnt=new HashMap<>();
        int minLen=Integer.MAX_VALUE;
        int maxCnt=0;
        for (int i=0;i<nums.length;i++){
            int k=nums[i];
            cnt.put(k, cnt.getOrDefault(k,0)+1);
            last.put(k, i+1);
            maxCnt=Math.max(maxCnt,cnt.get(k));
            if (!first.containsKey(k)){
                first.put(k,i);
            }

        }
        for (Integer key:cnt.keySet()){
            if (cnt.get(key)==maxCnt){
                if (last.get(key)-first.get(key)<minLen){
                    minLen=last.get(key)-first.get(key);
//                    ans=key;
                }
            }
        }
        return minLen;
    }

}
