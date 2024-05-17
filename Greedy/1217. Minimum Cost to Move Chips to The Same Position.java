class Solution {
    public int minCostToMoveChips(int[] position) {
        int cEve = 0;
        int cOdd = 0;

        for(int i: position){
            if(i % 2 == 0){
                cEve++;
            }   
            else{
                cOdd++;
            }
        }

        return Math.min(cOdd, cEve);

    }
}
