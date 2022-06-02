package yajha.solution;

public class P34 {

    public int[] searchRange(int[] nums, int target) {
        if (nums.length==0){
            return new int[]{-1,-1};
        }
        int left=0,right=nums.length-1;
        while (left<right){
            int mid=left+(right-left)/2;
            if (nums[mid]>=target){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        int left2=0,right2=nums.length-1;
        while (left2<right2){
            int mid=left2+(right2-left2)/2;
            if (nums[mid]>=target+1){
                right2=mid;
            }else{
                left2=mid+1;
            }
        }
        if (nums[left]==target){
            int te=nums[left2]==target?0:1;
            return new int[]{left,left2-te};
        }else{
            return new int[]{-1,-1};
        }
    }

}
