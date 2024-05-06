class MedianFinder {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public MedianFinder() {
       
        
    }
    
    public void addNum(int num) {
        if(maxHeap.isEmpty()){
            maxHeap.add(num);
            return;
        }

        if(num < maxHeap.peek()){
            maxHeap.add(num);
        }
        else{
            minHeap.add(num);
        }

        //Balancing Heaps so that neither of them will have imbalance in numeber of elements inside them 

        if(maxHeap.size() > minHeap.size() + 1){
            minHeap.add(maxHeap.remove());
        }
        if(maxHeap.size() < minHeap.size() ){
            maxHeap.add(minHeap.remove());
        }

    }
    
    public double findMedian() {
        if((maxHeap.size() + minHeap.size()) % 2  == 0){
            return (double)(((double)maxHeap.peek() + (double)minHeap.peek()) / 2);
        }
        else{
            return maxHeap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
