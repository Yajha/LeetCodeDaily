package yajha.solution;

//import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class P3 {
    public int lengthOfLongestSubstring(String s) {

        if (s==null){
            return 0;
        }
        int ans=0;
        int left=0,right=0;
        int len=s.length();
//        HashMap<Character,Integer> characterMap=new HashMap<>();
        Set<Character> characterSet=new HashSet<>();

        while (right<len){
            char ch=s.charAt(right);
            if (!characterSet.contains(ch)){
                characterSet.add(ch);
                ans=Math.max(ans,right-left+1);
                right++;
            }else{
                characterSet.remove(s.charAt(left));
                left+=1;
            }
        }

        return ans;
    }
}
