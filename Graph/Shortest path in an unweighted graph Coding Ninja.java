import java.util.*;

public class Solution {

	public static LinkedList<Integer> shortestPath(int[][] edges, int n, int m, int src, int t) {
			List<List<Integer>> adj = new ArrayList();

			for(int i = 0; i < n; i ++){
				adj.add(new ArrayList());
			}
			int parent[] = new int[n];
			boolean visited[] = new boolean[n];

			for(int i = 0; i < m; i ++){
				adj.get(edges[i][0] - 1).add(edges[i][1] - 1);
				adj.get(edges[i][1] - 1).add(edges[i][0] - 1);
			}
			parent[src - 1] = -1;
			Queue<Integer> q = new LinkedList();
			visited[src - 1] = true;
			q.offer(src - 1);

			while(!q.isEmpty()){
				int curr = q.poll();

				for(int i: adj.get(curr)){
					if(visited[i] == true)continue;

					q.offer(i);
					visited[i] = true;
					parent[i] = curr;
				}
			}

			// for(int i: parent){
			// 	System.out.print(i +" ");
			// }
			// System.out.println();
			Stack<Integer> st = new Stack();
			t -= 1;
			st.push(t + 1);
			while(parent[t] != -1){
				st.push(parent[t] + 1);
				t = parent[t];
			}

			LinkedList<Integer> ll = new LinkedList<>();

			while(!st.isEmpty()){
				ll.add(st.pop());
			}

			// System.out.println("Ans: " + ll);

			return ll;

	}

}
