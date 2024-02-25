	    public static void main(String[] args) {


        // Do look at constraints seriously  
        
				int n = sc.nextInt();
				long s = sc.nextLong();
				int arr[] = input(n);
				
				int l  = 0, r = 0; long sumCurr = 0, ans = 0;
				
				while(r < n) {
					sumCurr += arr[r];
					
					while(sumCurr > s) {
						sumCurr -= arr[l];
						l++;
					}
					
					if(sumCurr <= s) {
						ans = Math.max(ans, r - l + 1);
					}
					r++;
					
				}
				
				System.out.println(ans);
				
	   
	    	
	}  	    
