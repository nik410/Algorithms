class Solution {
    // Function to find the number of islands.
    
    static int directions[][] = {
        {-1, 0},
        {1, 0},
        {0, -1},
        {0, 1},
        {-1, -1},
        {1, 1},
        {-1, 1},
        {1, -1}
    };
    
    
    public void dfs(int i, int j, boolean visited[][], char[][] grid){
        visited[i][j] = true;
        
        for(int direct[]: directions){
            int neighX = i + direct[0];
            int neighY = j + direct[1];
            
            if(neighX >= 0 && neighX < visited.length
                && neighY >= 0 && neighY < visited[0].length && grid[neighX][neighY] == '1' && visited[neighX][neighY] == false ){
                dfs(neighX, neighY, visited, grid);
            }
        }
    }
    
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        boolean visited[][] = new boolean[row][col];
        int islands = 0;
        
        //Using dfs
        
        
        // for(int i = 0; i < row; i ++){
        //     for(int j = 0; j < col; j ++){
                
        //         if(grid[i][j] == '1' && visited[i][j] == false){
                   
        //           dfs(i, j, visited, grid);
        //             islands ++;
                   
        //         }
        //     }
        // }
        
        
        for(int i = 0; i < row; i ++){
            for(int j = 0; j < col; j ++){
                
                if(grid[i][j] == '1' && visited[i][j] == false){
                   
                  bfs(i, j, grid, visited);
                    islands ++;
                   
                }
            }
        }
        
        return islands;
    }
    
    class Pair{
        int x;
        int y;
        
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    public void bfs(int i, int j, char grid[][], boolean visited[][]){
        Queue<Pair> q = new LinkedList();
        
        q.offer(new Pair(i, j));
        visited[i][j] = true;
        
        while(!q.isEmpty()){
            Pair curr = q.poll();
            
            for(int in = 0; in < 8; in ++){
                int newX = curr.x + directions[in][0];
                int newY = curr.y + directions[in][1];
                
                if( isValid(newX, newY, grid) && grid[newX][newY] == '1' && visited[newX][newY] == false ){
                    q.offer(new Pair(newX, newY));
                    visited[newX][newY] = true;
                }
            }
        }
    }
        
        public boolean isValid(int x, int y, char[][] grid){
            if(x >= 0 && x < grid.length && y >= 0 && y < grid[0].length){
                return true;
            }
            
            return false;
        }
        
    
}
