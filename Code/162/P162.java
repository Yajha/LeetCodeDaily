package yajha.solution;

public class P162 {
    public int findPeakElement(int[] nums) {
        int len=nums.length;
        int left=0,right=len-1;
        while (left<right){
            int mid=left+(right-left)/2;
            if (nums[mid]>nums[mid+1]){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }

}
