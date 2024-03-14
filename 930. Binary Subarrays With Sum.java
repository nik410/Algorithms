class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> hm = new HashMap();

        int sum = 0, count = 0, n = nums.length;
        int zcount = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            
            if(nums[i] == 0)zcount++;

            if(sum == goal){
                count++;
            }
           
            int rem = sum - goal;

            if(hm.containsKey(rem)){
                count += hm.get(rem);
            }
            
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);           
            
        }
     
        return count;
    }
}
