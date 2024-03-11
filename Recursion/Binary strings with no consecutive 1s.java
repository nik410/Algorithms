import java.util.*;

public class Solution {
    public static void ways(int N, int index, StringBuilder stb, List<String> ans){
        if(stb.length() == N){
            ans.add(stb.toString());
            return;
        }

        if(stb.length() == 0 || stb.charAt(index - 1) == '0'){
            stb.append('0');
            ways(N, index + 1, stb, ans);
            if(stb.length() > 0)
            stb.deleteCharAt(stb.length() - 1);
            
            stb.append('1');
            ways(N, index + 1, stb, ans);
            if(stb.length() > 0)
            stb.deleteCharAt(stb.length() - 1);
        }
        else if(stb.charAt(index - 1) == '1'){
             stb.append('0');
            ways(N, index + 1, stb, ans);
            if(stb.length() > 0)
            stb.deleteCharAt(stb.length() - 1);
        }
    }
    public static List< String > generateString(int N) {
       List<String> ans = new ArrayList();
       
       StringBuilder stb = new StringBuilder();
       
       ways(N, 0, stb, ans);

       return ans;
    }
}
