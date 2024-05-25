class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // int in[] = new int[numCourses];

        // for(int i = 0; i < prerequisites.length; i ++){
        //     in[prerequisites[i][0]] ++;
        // }

        // Queue<Integer> q = new LinkedList();
        // ArrayList<Integer> al = new ArrayList();       

        // for(int i = 0; i < in.length; i ++){
        //     if(in[i] == 0){
        //         q.offer(i);
        //         in[i] = -100;
        //     }
        // }

        // System.out.println(q +" Queue");

        // while(!q.isEmpty()){
        //     int curr = q.poll();
        //     al.add(curr);
            
        //     for(int i = 0; i < prerequisites.length; i ++){
        //         if(prerequisites[i][1] == curr){
        //             in[prerequisites[i][0]] --;
        //         }
        //         if(in[prerequisites[i][0]] == 0){
        //             q.offer(prerequisites[i][0]);
        //             in[prerequisites[i][0]] = -100;
        //         }
        //     }
        // }

        // if(al.size() == numCourses){
        //         int ans[] = new int[al.size()];   

        //         for(int i = 0; i < al.size(); i ++){
        //             ans[i] = al.get(i);
        //         }

        //         return ans;
        // }
        
        // else return new int[]{};
        // System.out.println(al);

        boolean visited[] = new boolean[numCourses];
        int path[] =  new int[numCourses];

        ArrayList<ArrayList<Integer>> adj = new ArrayList();
        ArrayList<Integer> al = new ArrayList();

         for(int i = 0; i < numCourses; i ++){
            adj.add(new ArrayList());
         }

        for(int i = 0; i < prerequisites.length; i ++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        for(int i = 0; i < numCourses; i ++){
            if(!visited[i]){
                if(isCycle(i, adj, visited, path, al))return new int[]{};
            }
        }
        
        //Keep in mind to store the arraylist values in reverse order for correct answer

        int ans[] = new int[al.size()];
        for(int i = 0; i < al.size(); i ++){
            ans[i] = al.get(al.size() - 1 - i);
        }


        return ans;
        
    }

    public boolean isCycle(int node, ArrayList<ArrayList<Integer>> adj, boolean visited[], int path[], ArrayList<Integer> al ){
        path[node] = 1;
        visited[node] = true;

        for(int i: adj.get(node)){
            if(path[i] == 1){
                return true;
            }
            
             if(!visited[i] && isCycle(i, adj, visited, path, al)){
                return true;
            }              
        }

        path[node] = 0;
        al.add(node);
        return false;
    }
}
