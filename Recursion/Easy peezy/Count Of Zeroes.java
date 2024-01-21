public static int countOfZeroes(int n){
        int countZero = 0;
        
        if(n == 0) return 0;
        
        if( n % 10 == 0){
            countZero = 1 + countOfZeroes(n/10);
            return countZero;
        }
        else {
             countZero = countOfZeroes(n/10);
             return countZero;
                } 
    }
