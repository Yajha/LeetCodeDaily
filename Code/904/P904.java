package yajha.solution;

import java.util.HashMap;
import java.util.Map;

public class P904 {
    public int totalFruit(int[] fruits) {
        int len=fruits.length;
        Map<Integer,Integer> map=new HashMap<>();
//        int cnt[]=new int[2];
        int left=0,right=0;
        int ans=0;
//        int typeA=0,typeB=0;
        for (right=0;right<len;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            while (map.size()>2){
                map.put(fruits[left],map.get(fruits[left])-1);
                if (map.get(fruits[left]) == 0) map.remove(fruits[left]);
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }

}
