class Solution {

    public double power(double x, int n){
        if(n == 0){
            return 1;
            }
         double tem= power(x, n /2);
         if(n % 2 ==0){
             return tem * tem;
         }
         else {
             if(n > 0)
             return x * tem * tem;
             else
                return (tem * tem) / x;
         }   
    }

    public double myPow(double x, int n) {
        return power(x, n);
    }
}
