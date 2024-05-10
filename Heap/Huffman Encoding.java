
class Solution {
    
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }
    
    public void preOrder(Node root, String stb, ArrayList<String> al){
        if(root.left == null && root.right == null){
            al.add(stb);
            return;
        }
        
        preOrder(root.left, stb + "0", al);
       
        preOrder(root.right, stb + "1", al);
       
        
    }
    
    
    class MyComparator implements Comparator<Node>{
        public int compare(Node n1, Node n2){
            if(n1.data == n2.data){
                return n1.data;
            }
            else
            return n1.data - n2.data;
        }
    }
    
    public ArrayList<String> huffmanCodes(String S, int f[], int N)
    {
        PriorityQueue<Node> pq = new PriorityQueue(new MyComparator());
        ArrayList<String> al = new ArrayList();
        
        for(int i = 0; i < S.length(); i ++){
            pq.add(new Node(f[i]));
        }
        Node root;
        while(pq.size() > 1){
            Node min1 = pq.remove();
            Node min2 = pq.remove();
            
            
            //System.out.println(min1.data +" D1" + " D2: " + min2.data);
            Node newAdd = new Node(min1.data + min2.data);
            
            newAdd.left = min1;
            newAdd.right = min2;
            
            pq.add(newAdd);
            
        }
        String stb = "";
        root = pq.remove();
        preOrder(root, stb,al);
        // System.out.println(al);
        return al;
    }
}
