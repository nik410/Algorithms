
class Solution{
    
     public static String recurConDuplicate(String s){
       if(s.length() <= 1)return s;
       
       if(s.charAt(0) != s.charAt(1)){
           return s.charAt(0) + "" + recurConDuplicate(s.substring(1));
       }
       else{
           return recurConDuplicate(s.substring(1));
       }
    }
    
    public String removeConsecutiveCharacter(String S){
        
       return recurConDuplicate(S);
    }
}
