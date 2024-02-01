class Solution {


    public void permut(int nums[], List<List<Integer>> ans, List<Integer> al,int visited[]){
        if(al.size() == nums.length){
            ans.add(new ArrayList(al));
            return;
        }

        for(int i = 0; i < visited.length; i++){
            if(visited[i] == 0){
                visited[i] = 1;
                al.add(nums[i]);
                permut(nums, ans, al, visited);
                visited[i] = 0;
                al.remove(al.size() - 1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> al = new ArrayList();
        int visited[] = new int[nums.length];
        permut(nums, ans, al, visited);
        return ans;
    }
}
