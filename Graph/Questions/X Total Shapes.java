class Solution
{
    //Function to find the number of 'X' total shapes.
    
    public boolean isValid(int x, int y, char grid[][]){
        if(x >= 0 && x < grid.length && y >= 0 && y < grid[0].length){
            return true;
        }
        return false;
    }
    
    static int moves[][] = {
        {-1, 0},
        {1, 0},
        {0, -1},
        {0, 1}
    };
    
    
    public void dfs(int i, int j, char grid[][], boolean visited[][]){
        visited[i][j] = true;
        
        for(int in = 0; in < 4; in ++){
            int newX =  i + moves[in][0];
            int newY =  j + moves[in][1];
            if(isValid(newX, newY, grid) && !visited[newX][newY] && grid[newX][newY] == 'X'){
                // visited[newX][newY] = true;
                dfs(newX, newY, grid, visited);
                
            }
        }
    }
    
    public int xShape(char[][] grid)
    {
        int row = grid.length;
        int col = grid[0].length;
        boolean visited[][] = new boolean[row][col];
        
        int xShapes = 0;
        
        for(int i = 0; i < row; i ++){
            for(int j = 0; j < col; j ++){
                if(visited[i][j] == false && grid[i][j] == 'X'){
                    bfs(i, j, grid, visited);
                    xShapes ++;
                }
            }
        }
        
        return xShapes;
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
        visited[i][j] = true;
        
        Queue<Pair> q = new LinkedList();
        
        q.offer(new Pair(i, j));
        
        while(!q.isEmpty()){
            Pair curr = q.poll();
            
            for(int in = 0; in < 4; in ++){
                int newX = curr.x + moves[in][0];
                int newY = curr.y + moves[in][1];
                
                if(isValid(newX, newY, grid) && visited[newX][newY] == false && grid[newX][newY] == 'X'){
                    q.offer(new Pair(newX, newY));
                    visited[newX][newY] = true;
                }
            }
        }
        
        
        
    }
}
