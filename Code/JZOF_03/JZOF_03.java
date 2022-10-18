package yajha.solution;

public class JZOF_03 {
    public int findRepeatNumber(int[] nums) {
        int len= nums.length;
        for (int i=0;i<len;i++){
            while (nums[i]!=i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                swap(nums,i,nums[i]);
            }
        }
        return -1;
    }

    public void swap(int[] nums,int i,int j){
        int te=nums[i];
        nums[i]=nums[j];
        nums[j]=te;
    }
}
