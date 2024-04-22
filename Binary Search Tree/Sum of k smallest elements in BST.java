class Tree {
    
    
    public static void inorder(Node root, int sumAns[], int k[]){
        if( root == null)return;
        
        inorder(root.left, sumAns, k);
        if(k[0] <= 0)return;
        k[0]--;
       
        sumAns[0] += root.data;
        
        
        
        inorder(root.right, sumAns, k);
        
    }
    int sum(Node root, int k) { 
        
        int sumAns[] = new int[1];
        sumAns[0] = 0;
        int kVal[] = new int[1];
        kVal[0] = k;
        inorder(root, sumAns, kVal);
        
        return sumAns[0];
    } 
}
