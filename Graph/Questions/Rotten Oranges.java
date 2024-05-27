class Solution
{
    //Function to find minimum time required to rot all oranges. 
    
    public boolean isValid(int x, int y, int grid[][]){
        if(x >= 0 && x < grid.length && y >= 0 && y < grid[0].length){
            return true;
        }
        
        return false;
    }    
    
    public int orangesRotting(int[][] grid)
    {
        int row = grid.length;
        int col = grid[0].length;
        int time = 0;
        
        int movements[][] = {
            {-1, 0},
            {1, 0},
            {0, 1},
            {0, -1}
        };
        
        Queue<int[]> q = new LinkedList();
        
        for(int i = 0; i < row; i ++){
            for(int j = 0; j < col; j ++){
                if(grid[i][j] == 2){
                    q.offer(new int[]{i, j, 0});
                }
            }
        }
        
        while(!q.isEmpty()){
            int curr[] = q.poll();
            
            for(int in = 0; in < 4; in ++){
                int newX = curr[0] + movements[in][0];
                int newY = curr[1] + movements[in][1];
                
                if(isValid(newX, newY, grid) && grid[newX][newY] == 1){
                    grid[newX][newY] = 2;
                    q.offer(new int[]{newX, newY, curr[2] + 1});
                    time = Math.max(time, curr[2] + 1);
                }
            }
        }
        
        for(int i = 0; i < row; i ++){
            for(int j = 0; j < col; j ++){
                if(grid[i][j] == 1)return -1;
            }
        }
        
        return time;
        
        
    }
}
