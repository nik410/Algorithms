class Solution {


    // public void permut(int nums[], List<List<Integer>> ans, List<Integer> al,int visited[]){
    //     if(al.size() == nums.length){
    //         ans.add(new ArrayList(al));
    //         return;
    //     }

    //     for(int i = 0; i < visited.length; i++){
    //         if(visited[i] == 0){
    //             visited[i] = 1;
    //             al.add(nums[i]);
    //             permut(nums, ans, al, visited);
    //             visited[i] = 0;
    //             al.remove(al.size() - 1);
    //         }
    //     }
    // }


    class Solution {


    // public void permut(int nums[], List<List<Integer>> ans, List<Integer> al,int visited[]){
    //     if(al.size() == nums.length){
    //         ans.add(new ArrayList(al));
    //         return;
    //     }

    //     for(int i = 0; i < visited.length; i++){
    //         if(visited[i] == 0){
    //             visited[i] = 1;
    //             al.add(nums[i]);
    //             permut(nums, ans, al, visited);
    //             visited[i] = 0;
    //             al.remove(al.size() - 1);
    //         }
    //     }
    // }

    public void swap(int a, int b){
      
        return;
    }


     //Better Solution
        
    public void permut(int nums[], int index, List<List<Integer>> ans){
        if(index == nums.length){
            ans.add(new ArrayList(Arrays.stream(nums).boxed().toList()));
            return ;
        }

        for(int i = index; i < nums.length; i++){
            
            //Swapping
             int temp = nums[index];
             nums[index] = nums[i];
             nums[i] = temp;

            permut(nums, index + 1, ans);

            //Swapping
            temp = nums[index];
             nums[index] = nums[i];
             nums[i] = temp;

        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        
        permut(nums, 0, ans);
        return ans;
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
