class Solution {
    public boolean backspaceCompare(String s, String t) {
        //Usage of stack can be done but normal traversal can also be used to reduce space complexity
        String s1 = ""; int c1 = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == '#')c1++;
            else{
                if(c1 == 0){
                    s1 += s.charAt(i) + "";
                }
                else{
                    c1--;
                }
            }
        }


        String s2 = ""; int c2 = 0;
        for(int i = t.length() - 1; i >= 0; i--){
            if(t.charAt(i) == '#')c2++;
            else{
                if(c2 == 0){
                    s2 += t.charAt(i) + "";
                }
                else{
                    c2--;
                }
            }
        }

        return s1.equals(s2);

    }
}
