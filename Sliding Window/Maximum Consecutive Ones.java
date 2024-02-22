import java.util.ArrayList;

public class Solution {
	public static int longestSubSeg(ArrayList<Integer> arr , int n, int k) {
		int l = 0, r = 0, maxAns = 0;
		int c0 = 0;
		while(r < arr.size()){
			if(arr.get(r) == 0){
				c0++;				
			}
			while(c0 > k && l <= r){
				if(arr.get(l) == 0)c0--;
				l++;
			}
			
			if(c0 <=k){
				maxAns = Math.max(maxAns, r - l + 1);
				r++;
			}
							

			
		}

		return maxAns;
	}
}
