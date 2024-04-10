/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Tree {
    ArrayList<Integer> postOrder(Node node) {
       //PostOrder - LRN  --- NRL
       ArrayList<Integer> al = new ArrayList();
       
       Stack<Node> st = new Stack();
       Stack<Integer> stRE = new Stack();
       
       st.push(node);
       
       while(!st.isEmpty()){
           Node temp = st.peek();
           st.pop();
            stRE.push(temp.data);
            
              if(temp.left != null){
               st.push(temp.left);
           }
           
           if(temp.right != null){
               st.push(temp.right);
           }
           
          
       }
       
       while(!stRE.isEmpty()){
           al.add(stRE.pop());
       }
       
       return al;
    }
}
