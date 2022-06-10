package yajha.solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P501 {
    int cnt,ansCnt;
    int curNum=100001;
    List<Integer> numList = new LinkedList<>();
    public int[] findMode(TreeNode root) {
        dfs(root);
        int[] numArr=new int[numList.size()];
        for (int i=0;i<numArr.length;i++){
            numArr[i]=numList.get(i);
        }
        return numArr;
    }

    public void dfs(TreeNode root){
        if (root.left!=null) dfs(root.left);
        if (root.val==curNum){
            cnt++;
        }else{
            cnt=1;
            curNum=root.val;
        }
        if (cnt>ansCnt){
            numList.clear();
            numList.add(root.val);
            ansCnt=cnt;
        }else if (cnt==ansCnt) {
            numList.add(root.val);
        }
        if (root.right!=null) dfs(root.right);
    }

}
