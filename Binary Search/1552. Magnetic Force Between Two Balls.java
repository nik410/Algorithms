class Solution {
    public int maxDistance(int[] position, int m) {
        
        Arrays.sort(position);
        
        int l = 1, r = position[position.length - 1], ans = -1;

        while(l <= r){
            int mid = l + (r - l) / 2;

            int countBalls = 1, prevCoordinate= position[0];

            for(int i: position){
                if(i - prevCoordinate >= mid){
                    countBalls++;
                    prevCoordinate = i;
                }
            }

            if(countBalls < m){
                r = mid - 1;
                }
            else{
                ans = mid;
                l = mid + 1;
            }
        }

        // You can return either r or ans both works fine
        
        return r;
    }
}
