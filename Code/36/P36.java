package yajha.solution;

public class P36 {
    public boolean isValidSudoku(char[][] board) {

        int[][] row=new int[9][9];
        int[][] column=new int[9][9];
        int[][] grid=new int[9][9];

        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                if (board[i][j]!='.'){
                    int num=board[i][j]-'0'-1;
                    int gridIndex=i/3*3+j/3;
                    if (row[i][num]==1 || column[j][num]==1 || grid[gridIndex][num]==1){
                        return false;
                    }else{
                        row[i][num]=1;
                        column[j][num]=1;
                        grid[gridIndex][num]=1;
                    }
                }
            }
        }
        return true;
    }
}
