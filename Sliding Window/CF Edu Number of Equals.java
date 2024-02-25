	    public static void main(String[] args) {
	    	
				int n = sc.nextInt();
				int m = sc.nextInt();
				int arr[] = input(n);
				int brr[] = input(m);
				
				int l = 0, r = 0, ans = 0, c = 0; 
				
				while(l < n) {
					if(l != 0 &&arr[l] == arr[l - 1]) {
						ans += c;
						l++;
						continue;
					}		
					c = 0;
					int arrVal = arr[l];
					
					 while(r<m&&arr[l]>brr[r])
					      r++ ;
					while( r < m &&arr[l] == brr[r] ) {
						c++;
						r++;
					}
					
					ans += c;
					l++;
					
				}
				
				System.out.println(ans);
				
	   
	    	
	}  	    
