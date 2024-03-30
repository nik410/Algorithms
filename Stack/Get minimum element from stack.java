class GfG
{
    int minEle;
    Stack<Integer> s;
    
    // Constructor    
    GfG()
	{
        s = new Stack();
	}
	
    /*returns min element from stack*/
    int getMin()
    {
	if(s.isEmpty()){
	    return -1;
	}	
	else{
	    int actualMinVal = s.peek() % 103;
	    return actualMinVal;
	}
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	if(s.isEmpty()){
	    return -1;
	}	
	else{
	    int actualVal = s.peek() / 103;
	    s.pop();
	    return actualVal;
	}
    }

    /*push element x into the stack*/
    void push(int x)
    {
	if(s.isEmpty()){
	    int toInsert = x * 103 + x;
	    s.push(toInsert);
	}
	else{
	    int toInsert = x * 103 + Math.min(x, s.peek() % 103);
	    s.push(toInsert);
	}
    }	
}
