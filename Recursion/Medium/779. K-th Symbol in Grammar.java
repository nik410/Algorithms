class Solution {

    public String recur(int n, int k,String s){
        if(s.length() > (Math.pow(2, n)) / 2){
            return s;
        }
        String newS = "";
        for(int i = 0; i < s.length() ; i++){
            if(s.charAt(i) == '0'){               
                String s1 = "01";
                newS += s1;
            }
            else if(s.charAt(i) == '1'){
                
                 String s1 = "10";
                newS +=s1;
            }
        }
        return recur(n, k, newS);
    }

    public int kthGrammar(int n, int k) {

      // Will give TLE Intution is pattern finding
        String s = "0";        
        String ans = recur(n, k, s);
        char c = ans.charAt((k - 1)% ans.length());
        
        return Character.getNumericValue(c);
    }
}
