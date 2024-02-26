		public static void main(String[] args) {
		    	
	  //  Link to the task 
    //  https://codeforces.com/edu/course/2/lesson/9/2/practice/contest/307093/problem/E
			
			int n = sc.nextInt();
			long s = sc.nextLong();
			int arr[] = input(n);
			
			int l = 0, r= 0;
			long ans = 0;
			HashMap<Integer, Integer> hm = new HashMap();
      // In place of hashmap can use direct table addressing also as hashmap and create a vairable distinct or unique to store the number of distinct elements till now
			while(r < n) {
				hm.put(arr[r], hm.getOrDefault(arr[r], 0) + 1);
				
				while(hm.size() > s) {
					if(hm.get(arr[l]) == 1)
						hm.remove(arr[l]);
					else {
						hm.put(arr[l], hm.get(arr[l]) - 1);
					}
					l++;
				}
				
				if(hm.size() <= s)
				ans += r - l + 1;
				r++;
			}
			
			System.out.println(ans);
			
		}  	    
		 
