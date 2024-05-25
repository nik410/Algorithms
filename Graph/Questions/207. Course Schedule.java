class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        // Using Kahn Algo (BFS)
        
        // int indegree[] = new int[numCourses];

        // for(int i = 0; i < prerequisites.length; i ++){
        //     indegree[prerequisites[i][0]]++;
        // }

        // Queue<Integer> q = new LinkedList();

        // for(int i = 0; i < numCourses; i ++){
        //     if(indegree[i] == 0) q.offer(i);
        //     if(indegree[i] == 0) indegree[i] = -100;

        // }

        // //System.out.println(q);

        // ArrayList<Integer> al = new ArrayList();

        // while(!q.isEmpty()){
        //     int curr = q.poll();
        //     al.add(curr);
        //     // System.out.println(al);
        //     for(int i = 0; i < prerequisites.length; i ++){
        //         if(prerequisites[i][1] == curr){
        //             indegree[prerequisites[i][0]] --;
        //         }
        //         if(indegree[prerequisites[i][0]] == 0){
        //             q.add(prerequisites[i][0]);
        //             // System.out.println(q +" Q");
        //             indegree[prerequisites[i][0]] = -100;
        //             }
        //     }

        // }

        // if(al.size() == numCourses)return true;
        // else
        // return false;

        //Using DFS

        boolean visited[] = new boolean[numCourses];
        int path[] = new int[numCourses];

        ArrayList<ArrayList<Integer>> al = new ArrayList();

        for(int i = 0; i < numCourses; i ++){
            al.add(new ArrayList<>());
        }

        for(int i = 0; i < prerequisites.length; i ++){
           al.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        // for(ArrayList<Integer> a: al){
        //     System.out.println(a);
        // }

        for(int i = 0; i < numCourses; i ++){
            if(!visited[i]){
                if(dfs(i, al, visited, path))return false;
            }
        }


        return true;


    }

    public boolean dfs(int node, ArrayList<ArrayList<Integer>> al, boolean visited[], int path[]){
        visited[node] = true;
        path[node] = 1;

        for(int i: al.get(node)){

             if(path[i] == 1){
                return true;
            }

            if(visited[i])continue;           

            if(dfs(i, al, visited, path)){
                return true;
            }
        }

        path[node] = 0;

        return false;

    }
}
