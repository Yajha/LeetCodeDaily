package yajha.solution;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class P811 {
    public List<String> subdomainVisits(String[] cpdomains) {

        Map<String, Integer> map = new HashMap<>();
        List<String> ans=new LinkedList<>();
        for (String st :cpdomains){
            String delimeter1=" ";
            String delimeter2=".";
            String[] stArr=st.split(delimeter1);
            int cnt=Integer.valueOf(stArr[0]);
            String url=stArr[1];
            map.put(url,map.getOrDefault(url,0)+cnt);
            int index = url.indexOf(delimeter2);
            while (index!=-1){
                String slice=url.substring(index+1);
                map.put(slice,map.getOrDefault(slice,0)+cnt);
                index=url.indexOf(delimeter2,index+1);
            }

        }
        for (String key:map.keySet()){
            ans.add(String.valueOf(map.get(key))+" "+key);
        }
        return ans;
    }

}
