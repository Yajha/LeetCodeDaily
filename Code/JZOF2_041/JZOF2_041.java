package yajha.solution;

import java.util.LinkedList;
import java.util.List;

public class JZOF2_041 {
    /** Initialize your data structure here. */
    List<Integer> numList=new LinkedList<>();
    int size=0;
    int left=0,right=0;
    double sum=0;
    public void MovingAverage(int size) {
        this.size=size;
    }

    public double next(int val) {
        if (numList.size()<this.size){
            numList.add(val);
            sum+=val;
            right++;
            return sum/numList.size();
        }else{
            numList.add(val);
            sum-=this.numList.get(left);
            sum+=val;
            left++;
            right++;
            return sum/size;
        }

    }

}
