/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

// class MyComparator implements Comparator<Item>{
//     public int compare(Item i1, Item i2){
//         return Integer.compare(i2.value, i1.value);
//     }
// }

class Solution {
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int w, Item arr[], int n) {
    //   Arrays.sort(arr, new MyComparator());
    
    //     for(Item i: arr){
    //         System.out.println(i.value + " " + i.weight);
    //     }
        
        double vToWRatio[][] = new double[arr.length][2];
        
        for(int i = 0; i < arr.length; i++){
            vToWRatio[i][0] = (double)(arr[i].value / (double) arr[i].weight);
            vToWRatio[i][1] = i;
        }
        
        Arrays.sort(vToWRatio, (a,b) -> Double.compare(b[0], a[0]));
        
        double ans = 0;
        
        for(int i = 0; i < arr.length && w > 0; i++){
        if(w > arr[(int)(vToWRatio[i][1])].weight){
          ans += (double) vToWRatio[i][0] * (arr[(int)(vToWRatio[i][1])].weight);
          w -= arr[(int)(vToWRatio[i][1])].weight;
            
        }
          else{
              ans += vToWRatio[i][0] * w;
              w = 0;
          }
        }
        
        
        return ans;
       
    }
}
