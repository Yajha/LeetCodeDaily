package yajha.solution;

public class P930 {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int len=nums.length;
        int left1=0,right=0;
        int left2=0;
        int sum1=0,sum2=0;
        int ans=0;
        while (right<len){
            sum1+=nums[right];
            sum2+=nums[right];
            while(left1<=right && sum1>goal){
                sum1-=nums[left1];
                left1++;
            }
            while(left2<=right && sum2>=goal){
                sum2-=nums[left2];
                left2++;
            }
            ans+=(left2-left1);
            right++;
        }
        return ans;
    }

}
