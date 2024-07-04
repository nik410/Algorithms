

class Solution
{
    class Pair{
        int row;
        int col;
        int step;
        
        Pair(int row, int col, int step){
            this.row = row;
            this.col = col;
            this.step = step;
        }
    }
    
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        int direc[][] = {
            {-2, -1},
            {-2, 1},
            {2, -1},
            {2, 1},
            {-1, -2},
            {1, -2},
            {-1, 2},
            {1, 2}
        };
        
        Queue<Pair> q = new LinkedList();
        boolean visited[][] = new boolean[ N + 1][N + 1];
        
        q.offer(new Pair(KnightPos[0], KnightPos[1], 0));
        visited[KnightPos[0]][KnightPos[1]] = true;
        
        int min = Integer.MAX_VALUE;
        
        while(!q.isEmpty()){
            Pair temp = q.poll();
            
            if(temp.row == TargetPos[0] && temp.col == TargetPos[1]){
                 min = Math.min(min, temp.step);
            }
            
            for(int i[]: direc){
                int newX = temp.row + i[0];
                int newY = temp.col + i[1];
                
                 if(newX == TargetPos[0] && newY == TargetPos[1]){
                     min = Math.min(min, temp.step + 1);
                 }
                
                if(newX >= 0 && newX < N && newY >= 0 && newY < N && visited[newX][newY] == false){
                   q.offer(new Pair(newX, newY, temp.step + 1));
                   visited[newX][newY] = true;
                }
            }
        }
        
        if(min == Integer.MAX_VALUE)
            return -1;
        else
            return min;
    }
}
