
class Solution{
    
    
    public boolean isValid(int i, int j, int[][] hospital){
        if(i < hospital.length && i >= 0 && j >= 0 && j < hospital[0].length){
            return true;
        }
        return false;
    }
    
    class Pair{
        int x;
        int y;
        int time;
        
        Pair(int x, int y, int time){
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }
    
    // public void bfs(int i, int j, int[][] hospital, boolean visited[][], int ans[]){
    // }
    
    
     public int helpaterp(int[][] hospital) {
        int row = hospital.length;
        int col = hospital[0].length;
        
         
        int max = 0;
        boolean visited[][] = new boolean[row][col];
        
        Queue<Pair> q = new LinkedList();
        
        for(int i = 0; i < row; i ++){
            for(int j = 0; j < col; j ++){
                
                if(hospital[i][j] == 2){
                    q.offer(new Pair(i, j, 0));
                    visited[i][j] = true;
                    }
                }
            }
        
       
         
        int movements[][] = {
            {0, -1},
            {0, 1},
            {-1, 0},
            {1, 0}
        };
        
        
        while(!q.isEmpty()){
            
            Pair curr = q.poll();
            
            for(int in = 0; in < movements.length; in ++){
                    int newX = curr.x + movements[in][0];
                    int newY = curr.y + movements[in][1];
                    
                    if(isValid(newX, newY, hospital) && hospital[newX][newY] == 1){
                        q.offer(new Pair(newX, newY, curr.time + 1));
                        hospital[newX][newY] = 2;
                        max = Math.max(curr.time + 1, max);
                        visited[newX][newY] = true;
                    }
                }
            }
            
        
        for(int i = 0; i < row; i ++){
            for(int j = 0; j < col; j ++){
                
                if(hospital[i][j] == 1){
                    return -1;
                }
            }
        }
        
        return max;
        
        
        
    }
}
