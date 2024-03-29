class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	Stack<Integer> st = new Stack();
    	
    	for(int i = 0; i < n; i++){
    	    st.push(i);
    	}
    	
    	while(st.size() > 1){
    	    int guest1 = st.pop();
    	    int guest2 = st.pop();
    	    
    	    if(M[guest1][guest2] == 0 && M[guest2][guest1] == 1){
    	        st.push(guest1);
    	    }
    	    else if(M[guest1][guest2] == 1 && M[guest2][guest1] == 0){
    	        st.push(guest2);
    	    }
    	    
    	}
    	if(st.isEmpty())return -1;
    	int candCeleb = st.pop();
    	
    	for(int i =0; i <  n; i++){
    	    if(M[candCeleb][i] == 1  || (M[i][candCeleb] == 0 && i != candCeleb))return -1;
    	}
    	
    	return candCeleb;
    }
}
