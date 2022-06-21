package yajha.solution;

public class P1658 {
    public int minOperations(int[] nums, int x) {
        int len=nums.length;
        int t=0;
        for (int i=0;i<nums.length;i++){
            t+=nums[i];
        }
        t-=x;
        if (t<0) return -1;
        int left=0,right=0;
        int ans=-1;
        int sum=0;
        while (right<len){
            sum += nums[right];
            while(sum>t){
                sum-=nums[left];
                left++;
            }
            if (sum==t) {
                ans=Math.max(ans,right-left+1);
            }
            right++;

        }

        return ans==-1?-1:len-ans;
    }

}
