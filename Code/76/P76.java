package yajha.solution;

import java.util.HashMap;
import java.util.Map;

public class P76 {
    public String minWindow(String s, String t) {
        int len1=s.length(),len2=t.length();
        int left=0,right=0;
        int curNum=0;
        int minLen=Integer.MAX_VALUE;
        int ansLeft=0,ansRight=0;
        Boolean flag=false;
        Map<Character,Integer> tMap=new HashMap<>();
        Map<Character,Integer> cur=new HashMap<>();
        for (int i=0;i<len2;i++){
            tMap.put(t.charAt(i),tMap.getOrDefault(t.charAt(i),0)+1);
        }

        while (right<len1){
            Character charRight=s.charAt(right);
            cur.put(charRight,cur.getOrDefault(charRight,0)+1);
            if (cur.get(charRight)<=tMap.getOrDefault(charRight,-1)){
                curNum++;
            }
            while(curNum==len2){
                flag=true;
                if (minLen>right-left+1){
                    ansLeft=left;
                    ansRight=right;
                    minLen=right-left+1;
                }

                Character charLeft=s.charAt(left);
                cur.put(charLeft,cur.get(charLeft)-1);
                if (cur.get(charLeft)<tMap.getOrDefault(charLeft,-1)){
                    curNum--;
                }
                left++;
            }
            right++;
        }
        if (!flag) return "";
        return s.substring(ansLeft,ansRight+1);
    }

}
