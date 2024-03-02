import java.util.* ;
import java.io.*; 

public class Solution {

	public static int sqrtN(long N) {
		/*
		 * Write your code here
		 */
		long l = 0, r = 2, ans = 0;

    //The concept of gradually incresing the search space by using r *= 2 will help in avoiding looking answers in a large area and
    // help in acheiving better time complexity

		while(l <= r){
			long mid = l + (r - l) / 2;
			
			if(mid * mid == N)return (int)mid;
			if(mid * mid < N){
				l = mid + 1;
				r *= 2;		
			}
			else if(mid * mid > N){
				ans = mid;
				r =  mid - 1;
			}
		}

		return (int)ans - 1;
	}
}
