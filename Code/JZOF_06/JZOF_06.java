package yajha.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JZOF_06 {
    ArrayList<Integer> ans=new ArrayList<>();

    public int[] reversePrint(ListNode head) {
        recur(head);
        int ansArr[]=new int[ans.size()];
        for (int i=0;i<ans.size();i++){
            ansArr[i]=ans.get(i);
        }
        return ansArr;
    }

    public void recur(ListNode head){
        if (head!=null){
            if (head.next!=null){
                reversePrint(head.next);
            }
            ans.add(head.val);
        }
    }
}
