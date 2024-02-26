	public static void main(String[] args) {

  //   Link to the task 
  //   https://codeforces.com/edu/course/2/lesson/9/2/practice/contest/307093/problem/D
    
		int n = sc.nextInt();
		long s = sc.nextLong();
		int arr[] = input(n);
		
		int l = 0,  r = 0;
		long sum = 0, ans = 0;
		
		while(r < n) {			
			sum += arr[r];	
			
			while(sum >= s) {
				sum -= arr[l];
				l++;
			
			}		
	
			ans += l;
			
			r++;
		}
		System.out.println(ans);
		
		
	}  	    
	 
