//Different Ways To Do It


 public static int lengthOfNumber(int n){

        // Inbuilt Fuction with a TC ~ O ( log log n) 
        int len = (int) Math.log10(n) + 1;
        
        return len;
        
    }
    
    public static int reverse(int n){
     
       int ans =0;
      if(n > 0){
           int rem = n%10;
           int len =  lengthOfNumber(n);
          
           ans = rem * (int)Math.pow(10, len - 1) + reverse(n/10);
            System.out.println(len + " " + ans);
       }
       
       return ans;
        
    }
