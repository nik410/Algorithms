class Solution {
    public int leastInterval(char[] tasks, int n) {
        // int charCounter[] = new int[26];

        // for(char c: tasks){
        //     charCounter[c - 'A']++;
        // }

        // Arrays.sort(charCounter);
        // int batches = charCounter[25];
        // int vacant = (batches - 1) * n;

        // for(int i = 0; i < 25; i++){
        //     vacant -= Math.min(charCounter[i], (batches - 1));
        // }

        // if(vacant > 0)return tasks.length + vacant;
        // else
        //     return tasks.length;

       int charCounter[] = new int[26];

        for(char c: tasks){
            charCounter[c - 'A']++;
        }
        int timeC = 0;

        PriorityQueue<Task> pq = new PriorityQueue(new MyComparator());

        for(int i = 0; i < 26; i ++){
            if(charCounter[i] >= 1){
                pq.add(new Task(0, charCounter[i]));
            }
        }
        Queue<Task> q = new LinkedList();

        while(!pq.isEmpty() || !q.isEmpty()){
            if(!q.isEmpty() && timeC - q.peek().time > n){
                
                pq.add(q.poll());
            
            }
            
                if(!pq.isEmpty()){

                    Task t =  pq.remove();                
                    t.freq --;
                    t.time = timeC;

                    if(t.freq > 0){
                        q.offer(t);
                    }
                }
            
            timeC++;
        }


        return timeC;

    }

    class MyComparator implements Comparator<Task>{
        public int compare(Task t1, Task t2){
            return t2.freq - t1.freq;
        }
    }

    class Task{
        int time;
        int freq;

        Task(int time, int freq){
            this.time = time;
            this.freq = freq;
        }
    }


}
