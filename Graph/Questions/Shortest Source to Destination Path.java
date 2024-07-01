class Solution {
    
    class Triplet{
        int row;
        int col;
        int dist;
        
        Triplet(int row, int col, int dist){
            this.row = row;
            this.col = col;
            this.dist = dist;
        }
    }
    
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
        Queue<Triplet> q = new LinkedList();
        
        int direc[][] = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };
        
        if(A[0][0] == 0  || A[X][Y] == 0)return -1;
        
        
        boolean visited[][] = new boolean[N][M];
        
        q.offer(new Triplet(0, 0, 0));
        visited[0][0] = true;
        int minTime = 1000;
        
        while(!q.isEmpty()){
            Triplet temp = q.poll();
            
            if(temp.row == X && temp.col == Y)minTime = Math.min(minTime, temp.dist);
            
            for(int i = 0; i < 4; i ++){
                int newX = temp.row + direc[i][0];
                int newY = temp.col + direc[i][1];
                
                if(newX == X && newY == Y)minTime = Math.min(minTime, temp.dist + 1);
                
                if(newX >= 0 && newX < N && newY >= 0 && newY < M && A[newX][newY] == 1 && 
                    visited[newX][newY] == false){
                    q.offer(new Triplet(newX, newY, temp.dist + 1));
                    visited[newX][newY] = true;
                    
                    
                }
            }
            
        }
        if(minTime == 1000)return -1;
        else
        return minTime;
    }
};
