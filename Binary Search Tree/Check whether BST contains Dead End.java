class Solution
{
    public static boolean check(Node root, int lower, int upper){
        if(root == null)return false;
        
        if(root.left == null && root.right == null){
            if((root.data - lower ) == 1
                && (upper - root.data) == 1)return true;
            else
            return false;
        }
        
        boolean left = check(root.left, lower, root.data);
        boolean right = check(root.right, root.data, upper);
        
        return left || right;
        
    }
    
    public static boolean isDeadEnd(Node root)
    {
       boolean ans = check(root, 0 , 10002);
       
       return ans;
    }
}
