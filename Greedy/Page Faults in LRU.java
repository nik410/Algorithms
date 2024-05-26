
class Solution{
    static int pageFaults(int N, int C, int pages[]){
        LinkedHashSet<Integer> lhs = new LinkedHashSet();
        
        int ans = 0;
        
        for(int i: pages){
              if(!lhs.contains(i)){
                if(lhs.size() == C){
                     int first = lhs.stream().findFirst().get();
                     //System.out.println(first + " :First");
                     lhs.remove(first);
                     lhs.add(i);
                }
                else{
                    lhs.add(i);
                }
                ans ++;
            }
            else{
                lhs.remove(i);
                lhs.add(i);
            }
            
        }
        
        return ans;
    }
}
