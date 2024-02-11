class Solution {

    // //Recursion
    // static int move[] = {-1, 0 , 1};
    // public int maxCherry(int grid[][], int row, int roboAcol, int roboBcol, int dp[][][]){
    //     if(roboAcol < 0 || roboAcol >= grid[0].length || roboBcol < 0 || roboBcol >= grid[0].length){
    //             return 0;
    //     }
    //     if(row == grid.length) return 0;
    //     if(dp[row][roboAcol][roboBcol] != 0) return dp[row][roboAcol][roboBcol];
    //     int result = 0;
    //     result += grid[row][roboAcol] + grid[row][roboBcol];
    //     int ans = 0;
    //     for(int i = roboAcol - 1; i <= roboAcol + 1; i++){
    //         for(int j = roboBcol - 1; j <= roboBcol + 1; j++){
    //             if(i < j)
    //                 ans = Math.max(ans, maxCherry(grid, row + 1, i, j, dp));
    //         }
    //     }
    //     result += ans;
    //     return dp[row][roboAcol][roboBcol] = result;

    // }

    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int dp[][][] = new int[n+ 1][m + 1][m + 1];

        int ans = 0;
         for(int i = 0; i <n; i++){
            for(int j = 0; j < m ; j++){
                Arrays.fill(dp[i][j], - 1);
            }
            }


        dp[0][0][m - 1] = grid[0][0] + grid[0][m - 1];


        for(int i = 1; i <n; i++){
            for(int j = 0; j < m ; j++){
                for(int k = j + 1; k < m; k++){
                    int max = -1;

                        for(int l = -1; l <= 1; l++){
                            for(int m1 = -1; m1 <= 1; m1++){
                                 if(j + l >=0 && j + l < m && k + m1 >=0 && k + m1 < m)
                                    max = Math.max(max,dp[i - 1][j + l][k + m1]);
                                    }
                                 }
                    if(max != -1)
                    dp[i][j][k]= max + grid[i][j] +grid[i][k];
                    ans = Math.max(ans, dp[i][j][k]); 

                }
            }
        }

        return ans;

        // return maxCherry(grid, 0, 0, grid[0].length - 1, dp);
    }
}
