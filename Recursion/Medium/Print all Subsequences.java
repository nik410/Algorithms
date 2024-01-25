public static void subsequences(int arr[], int index, ArrayList<Integer> al,ArrayList<ArrayList<Integer>> ans){
        
        
        if(index == arr.length){
            
                ans.add(new ArrayList(al));
            
            return;
        }
        
        al.add(arr[index]);
        subsequences(arr, index + 1, al, ans);
        al.remove(al.size() - 1);
        subsequences(arr, index + 1, al, ans);
        
    }
    
