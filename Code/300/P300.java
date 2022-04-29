package yajha.solution;

public class P300 {

    //DP

//    public int lengthOfLIS(int[] nums) {
//        int len=nums.length;
//        int[] f=new int[len];
//        f[0]=1;
//        int ans=1;
//        for (int i=1;i<len;i++){
//            f[i]=1;
//            for (int j=0;j<i;j++){
//                if (nums[i]>nums[j]){
//                    f[i]=Math.max(f[j]+1,f[i]);
//                }
//            }
//            ans=Math.max(f[i],ans);
//
//        }
//        return ans;
//    }

    //DP + Binary Search

    public int lengthOfLIS(int[] nums) {
        int len=nums.length;
        //f[i]代表长度为i+1的LIS的最小末尾值
        int[] f=new int[len];
        f[0]=nums[0];
        //f的下标
        int index=0;

        for (int i=1;i<len;i++){
            if (nums[i]>f[index]){
                f[++index]=nums[i];
                continue;
            }
            int left=0,right=index;
            while (left<right){
                int mid=left+(right-left)/2;
                if (nums[i]>f[mid]){
                    left=mid+1;
                }else{
                    right=mid;
                }
            }
            f[left]=nums[i];
        }
        return index+1;
    }


}
