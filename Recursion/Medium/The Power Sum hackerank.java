
// https://www.hackerrank.com/challenges/the-power-sum/problem?isFullScreen=true

public static int numberOfWays(int X, int N,int counter){
        if(X == 0)return 1;
        if(X < 0)return 0;
        if(Math.pow(counter, N) > X)return 0;
        int taken = 0;
        if(Math.pow(counter, N) <= X)
        taken = numberOfWays(X - (int)Math.pow(counter, N), N, counter + 1);
        
        int notTaken = numberOfWays(X, N, counter + 1);
        
        return taken + notTaken;
    }
    public static int powerSum(int X, int N) {
   return numberOfWays(X, N, 1);

    }
