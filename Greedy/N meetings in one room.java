class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    
    
    public static int maxMeetings(int start[], int end[], int n)
    {
        int arr[][] = new int[n][2];
        
        for(int i = 0; i < n; i ++){
           arr[i][0] = start[i];
           arr[i][1] = end[i];
           }
           
           Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
           
        //   for(int i = 0; i < n; i ++){
        //   System.out.println(arr[i][0] + " " + arr[i][1]);
        //   }
           
           
           int endT = arr[0][1];
           int count = 1;
           int maxCount = 1;
           for(int i = 1; i < n; i ++){
               if(arr[i][0] > endT){
                   endT = arr[i][1];
                   count++;
               }
               
           }
           
           return count;
           
           
    }
}
