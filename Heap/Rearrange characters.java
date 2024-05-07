
class Solution
{
    static class Pair{
        char data;
        int freq;
        
        Pair(char data, int freq){
            this.data = data;
            this.freq = freq;
        }
    }
    
    static class MyComparator implements Comparator<Pair>{
        public int compare(Pair p1, Pair p2){
            return p2.freq - p1.freq;
        }
    }
    
	public static String rearrangeCharacters(String str) {
	    
	    PriorityQueue<Pair> pq = new PriorityQueue(new MyComparator());
	    HashMap<Character, Integer> hm = new HashMap();
	    for(int i = 0; i < str.length(); i ++){
	       hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
	    }
	    
	    for(char c: hm.keySet()){
	        pq.add(new Pair(c, hm.get(c)));
	        
	    }
	    
	   
	    
	    StringBuilder ans = new StringBuilder();
	    Pair prev = new Pair('$', 0);
	    
	    while(pq.size() > 0){
	        ans.append(pq.peek().data);
	        
	        Pair temp = pq.remove();
	        
	        System.out.println(ans.toString() +" : Str");
	       
	        temp.freq -= 1;
	        if(prev.freq > 0){
	            pq.add(prev);
	        }
	        
	        prev = temp;
	    }
	    
	     if(ans.length() == str.length()){
            return ans.toString();
        }else{
            return "-1";
        }
	}
}
