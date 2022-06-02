package yajha.solution;

public class P69 {

    public int mySqrt(int x) {
        long left=0,right=x;
        while (left<right){
            long mid=left+(right-left)/2;
            if (mid*mid>x){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        if (left*left==x){
            return (int)left;
        }else{
            return (int)left-1;
        }
    }

}
