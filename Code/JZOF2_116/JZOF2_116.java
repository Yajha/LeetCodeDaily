package yajha.solution;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JZOF2_116 {

//    int ans=0;
//    public int findCircleNum(int[][] isConnected) {
//        int n=isConnected.length;
//        boolean[] mark=new boolean[n];
//        for (int i=0;i<n;i++){
//            if (mark[i]==false){
//                dfs(i,mark,isConnected);
//                ans++;
//            }
//        }
//        return ans;
//    }
//
//    public void dfs(int i,boolean[] mark,int[][] isConnected) {
//        mark[i] = true;
//        for (int j = 0; j < mark.length; j++) {
//            if (i != j && mark[j] == false && isConnected[i][j]==1) {
//                dfs(j, mark,isConnected);
//            }
//        }
//    }

    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int[] fa=new int[n];
        int ans=0;
        for (int i=0;i<n;i++){
            fa[i]=i;
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i!=j && isConnected[i][j]==1){
                    union(i,j,fa);
                }
            }
        }
        for (int i=0;i<n;i++){
            if (fa[i]==i){
                ans++;
            }
        }
        return ans;
    }

    public int find(int x,int[] fa){
        if (fa[x]==x){
            return x;
        }else{
            return find(fa[x],fa);
        }
    }

    public void union(int x,int y,int[] fa){
        int fx=find(x,fa);
        int fy=find(y,fa);
        fa[fy]=fx;
    }

}
