package arrays;

public class Island {

    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 0},
                {1, 0, 0},
                {0, 0, 1},
                {1, 0, 0}
        };

        System.out.println(island(grid));
    }

    public static int island(int[][] arr){
        int row = arr.length;
        int col = arr[0]. length;

        int count = 0;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j]==1){
                    count++;
                    dfs(arr, i, j);
                }
            }
        }
        return count;
    }

    public static void dfs(int[][] arr, int r, int c){
        int row = arr.length;
        int col = arr[0]. length;

        if(r<0 || c<0 || r>=row ||c>=col || arr[r][c]==0) {
            return;
        }

        arr[r][c]=0;

        dfs(arr, r-1, c);
        dfs(arr, r+1, c);
        dfs(arr, r, c-1);
        dfs(arr, r, c+1);
    }
}
