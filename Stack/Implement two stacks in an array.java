class twoStacks
{
    int arr[];
    int top1 = -1;
    int top2 = 100;
    twoStacks()
    {
        arr = new int[100];
    }
    //Function to push an integer into the stack1.
    void push1(int x)
    {
     if(top1 + 1 == top2){
         return; 
     }
     else{
         arr[++top1] = x;
     }
    }
    //Function to push an integer into the stack2.
    void push2(int x)
    {
        if(top1 + 1 == top2){
         return; 
     }
     else{
         arr[--top2] = x;
     }
    }
    //Function to remove an element from top of the stack1.
    int pop1()
    {
      if(top1 == -1)return -1;
      else{
          int val = arr[top1];
          top1--;
          return val;  
      }
    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {
     if(top2 == 100)return -1;
      else{
          int val = arr[top2];
          top2++;
          return val;  
      }
    }
}
