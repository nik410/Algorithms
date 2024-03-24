public class Solution{
    static class Stack {
       
        int arr[];
        int l = 0, r = 0;
        Stack(int capacity) {
            arr = new int[capacity];
           
        }
        public void push(int num) {
            if(r >= arr.length){return;}
           arr[r] = num;
           ++r;
        }
        public int pop() {
            if(l == r)return -1;
            else{
                 r--;
                int ans = arr[r]; 
               
                return ans;
            }
        }
        public int top() {
              if(l == r)return -1;
            else{
                int ans = arr[r - 1];               
                return ans;
            }
        }
        public int isEmpty() {
           if(l == r)return 1;
           else{
               return 0;
           }
        }
        public int isFull() {
           if(r == arr.length)return 1;
           else{
               return 0;
           }
        }
    }
}
