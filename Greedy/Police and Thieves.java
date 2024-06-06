class Solution 
{ 
    static int catchThieves(char arr[], int n, int k) 
	{ 
	    
	    int caught = 0;
	    
        ArrayList<Integer> thieve = new ArrayList();
        ArrayList<Integer> police = new ArrayList();
        
        
        for(int i = 0; i < n; i ++){
            if(arr[i] == 'T'){
                thieve.add(i);
            }
            else{
               police.add(i);
            }
        }       
        
        int l = 0, r = 0;
        
        while(l < thieve.size() && r < police.size()){
            if(Math.abs(thieve.get(l) - police.get(r)) <= k){
                caught ++;
                l ++;
                r ++;
            }
            else if(thieve.get(l) > police.get(r)){
                r ++;
            }
            else{
                l ++;
            }
        }
        
        return caught;
	} 
} 
