package yajha.solution;

public class P42 {

    //DP
//    public int trap(int[] height) {
//        int len=height.length;
//        if (len==0) return 0;
//        int[] leftMax=new int[len];
//        int[] rightMax=new int[len];
//        leftMax[0]=height[0];
//        rightMax[len-1]=height[len-1];
//        int ans=0;
//        for (int i=1;i<len;i++){
//            leftMax[i]=Math.max(leftMax[i-1],height[i]);
//            int j=len-i-1;
//            rightMax[j]=Math.max(rightMax[j+1],height[j]);
//        }
//
//        for (int i=0;i<len;i++){
//            ans+=Math.min(leftMax[i],rightMax[i])-height[i];
//        }
//        return ans;
//    }



}
