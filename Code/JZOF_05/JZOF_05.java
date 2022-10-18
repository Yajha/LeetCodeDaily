package yajha.solution;

public class JZOF_05 {
    public String replaceSpace(String s) {
        StringBuilder sb=new StringBuilder();
        for (char ch:s.toCharArray()){
            if (ch==' '){
                sb.append("%20");
            }else{
                sb.append(ch);
            }

        }
        return sb.toString();
    }
}
