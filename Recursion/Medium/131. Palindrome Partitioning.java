class Solution {

    boolean isPal(String s, int l, int r){

        while(l < r){
            if(s.charAt(l) != s.charAt(r))return false;
            l ++;
            r -- ;
        }
        return true;
    }

    public void backtrack(String s, int index, List<List<String>> ans, List<String> al){

        if(index == s.length()){
            ans.add(new ArrayList<>(al));
            return;
        }


        for(int i = index; i < s.length(); i ++){
            if(isPal(s, index, i)){
                al.add(s.substring(index, i + 1));
                backtrack(s, i + 1, ans, al);
                al.remove(al.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList();
        List<String> al = new ArrayList();

        backtrack(s, 0, ans, al);

        return ans;
    }
}
