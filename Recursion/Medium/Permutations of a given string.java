class Solution {
    
    public void permut(char arr[], int index, List<String> ans){
        if(index == arr.length){
            
            String newS = "";
            for(char c: arr)newS += c + "";
            if(!ans.contains(newS))
            ans.add(newS);
            return;
        }
        
        for(int i = index; i < arr.length; i++){
            
            //Swapping
            
            char temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            
            permut(arr, index + 1, ans);
            
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            
        }
    }
    
    public List<String> find_permutation(String S) {
        char arr[] = S.toCharArray();
        List<String> ans = new ArrayList();
        permut(arr, 0, ans);
        Collections.sort(ans);
        return ans;
    }
}
