
class Solution{
    
    static class Pair{
        char data;
        int freq;
        
        Pair(char data, int freq){
            this.data = data;
            this.freq = freq;
        }
    }
    
    static class myComparator implements Comparator<Pair>{
        public int compare(Pair p1, Pair p2){
            return p2.freq - p1.freq;
        }
    }
    
    static int minValue(String s, int k){
        PriorityQueue<Pair> pq = new PriorityQueue<>(new myComparator());
        HashMap<Character, Integer> hm = new HashMap();
        for(int i = 0; i < s.length(); i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        for(char c: hm.keySet()){
            pq.add(new Pair(c, hm.get(c)));
        }
        
        while(k -- > 0){
            Pair maxFreq = pq.remove();
            
            int freq = maxFreq.freq;
            
            if(freq > 0)
            pq.add(new Pair(maxFreq.data, freq - 1));
            
        }
        
        int ans = 0;
        
        while(pq.size() > 0){
            Pair temp = pq.remove();
            
            ans += (int)(Math.pow(temp.freq, 2));
        }
        
        return ans;
        
    }
}
