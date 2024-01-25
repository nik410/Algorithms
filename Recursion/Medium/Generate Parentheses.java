public static void gsubsequences(int n, int count1, int count2, ArrayList<StringBuilder> al,StringBuilder stb){
        
        
        if(count1 + count2 == 2*n){
                
                al.add(new StringBuilder(stb));
            
            return;
        }
        if(count1 < n ){
            stb.append('(');
            gsubsequences(n, count1 + 1, count2, al, stb);
            stb.delete(stb.length() - 1, stb.length());
        }
         
        if(count2 < count1 ){
            stb.append(')');
            gsubsequences(n, count1, count2 + 1, al, stb);
            stb.delete(stb.length() - 1, stb.length());
        }
        
        
       
    }
    
