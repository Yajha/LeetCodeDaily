package yajha.solution;

public class JZOF_04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int m = matrix.length;
        if (m==0){
            return false;
        }
        int n = matrix[0].length;
        int i=0,j=n-1;
        while (j>=0 && i<m){
            if (matrix[i][j]==target){
                return true;
            }
            if (matrix[i][j]>target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}
