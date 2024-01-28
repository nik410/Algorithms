class Solution {

    public long recur(long x, long n){
        if(n == 0)return 1;

        long tem = recur(x, n/2) %(long)(1e9 + 7);

        if(n % 2==0)
        return tem%(long)(1e9 + 7) * tem%(long)(1e9 + 7);
        else 
        return (x * tem * tem) % (long)(1e9 + 7);
      
    }

    public int countGoodNumbers(long n) {

        long evePos = (n+1)/2;
        long oddPos = n/2;
        long ans = (recur(5, evePos) * recur(4, oddPos))%(long)(1e9 + 7);
        return (int) ans;
    }
}
