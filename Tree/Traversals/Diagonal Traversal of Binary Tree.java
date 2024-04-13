/* Node is defined as
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}*/
class Tree
{
    public static void find(Node root, int pos, int l[]){
        if(root == null)return;
        
        l[0] = Math.max(pos, l[0]);
        
        find(root.left, pos + 1, l);
        find(root.right, pos, l);
        
        
    }
    
    static void findD(Node root, Vector<Vector<Integer>> v, int l){
        if(root == null)return;
        
        if(v.size() <= l){
            v.add(new Vector<Integer>());
        }
        
        v.get(l).add(root.data);
        
        findD(root.left, v, l + 1);
        findD(root.right, v, l);
        
    }
    
     public ArrayList<Integer> diagonal(Node root)
      {
          int l[] = new int[1];
          find(root, 0, l);
           
          Vector<Vector<Integer>> v = new Vector(l[0] + 1);
          ArrayList<Integer> ans = new ArrayList();
          findD(root, v, 0);
          for(int i = 0; i < v.size(); i++){
              for(int j = 0; j < v.get(i).size(); j++){
                  ans.add(v.get(i).get(j));
              }
          }
           
          return ans;
      }
      
}
