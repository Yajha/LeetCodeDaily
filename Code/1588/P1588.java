package yajha.solution;

public class P1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int len=arr.length;
        int sum[]=new int[len];
        sum[0]=arr[0];
        for (int i=1;i<len;i++){
            sum[i]=sum[i-1]+arr[i];
        }
        int ans=0;
        for (int i=0;i<len;i++){
            for (int j=i;j<len;j++){
                if ((j-i+1)%2==1){
                    if (i==0){
                        ans+=sum[j];
                    }else{
                        ans+=sum[j]-sum[i-1];
                    }
                }
            }
        }
        return ans;
    }
}
