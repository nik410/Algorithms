class Solution {

    public static void ways(String digits, int index,  HashMap<Character, String> hm, 
                            List<String> ans,StringBuilder s){
            
            if(index == digits.length()){
                if(s.length() >= 1)
                ans.add(s.toString());                
                return;
            }

            String val = hm.get(digits.charAt(index));

            for(int i = 0; i < val.length(); i++){
                s.append(val.charAt(i));
                ways(digits, index + 1, hm, ans, s);
                if(s.length() >= 1)
                s.deleteCharAt(s.length() - 1);
            }

    }

    public List<String> letterCombinations(String digits) {

      //The standard backtrack question
      
      HashMap<Character, String> hm = new HashMap();
        int offset = 0;
        for(int i = 2; i <= 9; i++){
            int key = 48 + i;
            String val = "";           
            
            if(i == 7 || i== 9) {
                for(int j = 0; j < 4; j++){
                val += (char)(97 + offset++);
            }
            }
            else{
                for(int j = 0; j < 3; j++){
                val += (char)(97 + offset++);
            }
            
            }

             hm.put((char)(key), (val));
        }


         List<String> ans = new ArrayList();
        StringBuilder s = new StringBuilder();
         ways(digits, 0, hm, ans, s);

         return ans;


    }
}
