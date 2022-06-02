package yajha.solution;

public class P374 {
    public int guessNumber(int n) {
        int left=1,right=n;
        while (left<right){
            int mid=left+(right-left)/2;
            if (guess(mid)==0){
                return mid;
            }else if (guess(mid)==-1){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }

}
