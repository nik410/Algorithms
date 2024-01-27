class Solution {

    public String recur(int n, int k, String s, StringBuilder stb){
        if(stb.length() >= Math.pow(2, n) - 1){
            return stb.toString();
        }

       
        stb.append("1");

        StringBuilder invert = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0')invert.append("1");
            else if(s.charAt(i) == '1') invert.append("0");
        }
       invert = invert.reverse();
        stb.append(invert);
        return recur(n, k, stb.toString(), stb);
    }
    public char findKthBit(int n, int k) {
        String s ="0";
        StringBuilder stb = new StringBuilder(s);
        String ans = recur(n, k, s, stb);

        return ans.charAt(k - 1);
    }
}
