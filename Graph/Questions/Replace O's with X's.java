class Solution{
    
    static int movements[][] = {
        {-1, 0},
        {1, 0},
        {0, -1},
        {0, 1}
    };
    
    public static boolean isValid(int x, int y, char a[][]){
        if(x >= 0 && x < a.length && y >= 0 && y < a[0].length){
            return true;
        }
        
        return false;
        
    }
    
    static public void dfs(int i, int j, char a[][]){
        a[i][j] = 'T';
        
        for(int in = 0; in < 4; in ++){
            int newX = i + movements[in][0];
            int newY = j + movements[in][1];
            
            if(isValid(newX, newY, a) && a[newX][newY] == 'O'){
                a[newX][newY] = 'T';
                dfs(newX, newY, a);
            }
        }
    }
    
    static char[][] fill(int n, int m, char a[][])
    {
        // The main crux of the problem is to identify that any O's 
        // on the boundary and connecting to thme cannot be converted
        
        int row = a.length;
        int col = a[0].length;
        
        //Right Boundary
        
        for(int i = 0; i < row; i ++){
            if(a[i][0] == 'O'){
                // System.out.println(i +" :i");
                bfs(i, 0, a);
            }
        }
        
       
        
        // Top Boundary
         for(int i = 0; i < col; i ++){
            if(a[0][i] == 'O'){
                
                bfs(0, i, a);
            }
        }
        
        //Bottom Boundary
        
        for(int i = 0; i < col; i ++){
            if(a[row - 1][i] == 'O'){
                bfs(row - 1, i, a);
            }
        }
        
        
        
        //Left Boundary
        
        for(int i = 0; i < row; i ++){
            if(a[i][col - 1] == 'O'){
                bfs(i, col - 1, a);
            }
        }
        
        
        //  for(int i = 0; i < row; i ++){
        //     for(int j = 0; j < col; j ++){
        //         System.out.print(a[i][j] +" ");
        //     }
        //     System.out.println();
        // }
        
        
        for(int i = 0; i < row; i ++){
            for(int j = 0; j < col; j ++){
                if(a[i][j] == 'O'){
                    a[i][j] = 'X';
                }
                
                if(a[i][j] == 'T'){
                    a[i][j] = 'O';
                }
            }
        }
        
        // System.out.println("----------------------------");
        
        
        return a;

        
        
    }
    
    static class Pair{
        int x;
        int y;
        
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    public static void bfs(int i, int j, char a[][]){
        Queue<Pair> q = new LinkedList();
        q.offer(new Pair(i, j));
        a[i][j] = 'T';
        
        while(!q.isEmpty()){
            Pair curr = q.poll();
            
            for(int in = 0; in < 4; in ++){
                int newX = curr.x + movements[in][0];
                int newY = curr.y + movements[in][1];
                
                if(isValid(newX, newY, a) && a[newX][newY] == 'O'){
                    q.offer(new Pair(newX, newY));
                    a[newX][newY] = 'T';
                }
            }
        }
    }
    
    
    
}
