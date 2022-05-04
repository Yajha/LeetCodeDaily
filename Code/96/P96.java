package yajha.solution;

public class P96 {
    public int numTrees(int n) {
        long k=1;
        for (int i=1;i<=n;i++){
            k=k*(4*i-2)/(i+1);
        }
        return (int)k;
    }

}
