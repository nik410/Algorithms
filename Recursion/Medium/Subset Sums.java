class Solution{
    
    public static void subsetSums(ArrayList<Integer> arr, int index, ArrayList<Integer> ans, int sum){
        if(index == arr.size()){
            ans.add(sum);
            return;
        }
        //Not Taking the element in the sum
        subsetSums(arr, index + 1, ans, sum);
        // Taking
        subsetSums(arr, index + 1, ans, sum + arr.get(index));
        
        
        
    }
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> ans = new ArrayList();
        subsetSums(arr, 0, ans, 0);
        return ans;
    }
}
