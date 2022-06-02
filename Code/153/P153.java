package yajha.solution;

public class P153 {
    public int findMin(int[] nums) {
        int len=nums.length;
        int left=0,right=len-1;
        if (nums[0]<nums[len-1]) return nums[0];
        while (left<right){
            int mid=left+(right-left)/2;
            if (nums[mid]>=nums[len-1]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return nums[left];
    }
}
