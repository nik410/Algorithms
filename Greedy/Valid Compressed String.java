class Solution {
    static int checkCompressed(String S, String T) {
        
        int i = 0, j = 0;
        
        while(i < S.length() && j < T.length()){
            if(S.charAt(i) == T.charAt(j)){
                i ++;
                j ++;
            }
            else if((int)T.charAt(j) >=48 && (int)T.charAt(j) < 58){
                
                String num = "";
                
                while(j < T.length() && (int)T.charAt(j) >=48 && (int)T.charAt(j) < 58){
                    num += T.charAt(j);
                    j ++;
                }
                
                int number = Integer.parseInt(num);
                
                i += number;
                
            }
            else {
                return 0;
            }
        }
        
        if(i == S.length() && j == T.length())return 1;
        
        return 0;
    }
}
