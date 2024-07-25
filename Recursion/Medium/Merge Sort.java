class Solution {

    public void merge(int nums[], int l, int r, int mid){
        int left[] = new int[mid - l + 1];
        int right[] = new int[r - mid];

        for(int i = 0; i < mid - l + 1; i ++){
            left[i] = nums[l + i];
        }

        for(int i = 0; i < r - mid; i ++){
            right[i] = nums[mid + 1 + i];
        }


        int p1 = 0, p2 = 0;

        int k = l;

        while(p1 < mid - l + 1 && p2 < r - mid){
            if(left[p1] <= right[p2]){
                nums[k] = left[p1];
                p1 ++;
                k ++;
            }
            else{
                nums[k] = right[p2];
                p2 ++;
                k ++;
            }
        }

        while(p1 < mid - l + 1){
            nums[k] = left[p1];
            p1 ++;
            k ++;
        }

        while(p2 < r - mid){
            nums[k] = right[p2];
            p2 ++;
            k ++;
        }

    }

    public void mergeSort(int nums[], int l, int r){
        if(l < r){
            int mid = l + (r - l) / 2;
            mergeSort(nums, l, mid);
            mergeSort(nums, mid + 1, r);
            merge(nums, l, r, mid);
        }
    }

    public int[] sortArray(int[] nums) {
        mergeSort(nums,0, nums.length - 1);
        return nums;
    }
}
