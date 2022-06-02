package yajha.solution;

public class P80 {
    public int removeDuplicates(int[] nums) {
        int len=nums.length;
        int slow=2,fast=2;
        while (fast<len){
            if (nums[fast]!=nums[slow-2]){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

}
