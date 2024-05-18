
class Solution
{
    static int majorityElement(int a[], int size)
    {
        int candEle = -1;
        int count = 0;
        
        for(int i = 0; i < size; i ++){
            if(count == 0){
                candEle = a[i];
                count++;
            }
            else{
                if(candEle == a[i])count ++;
                else{
                    count --;
                }
            }
        }
        int c = 0;
        for(int i: a){
            if(i == candEle){
                c++;
            }
        }
        
        if(c > size / 2)return candEle;
        else 
            return -1;
    }
}
