package tree;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {

    private int V; //no of vertices
    private LinkedList<Integer> adj[];

    BFS(int v){
        this.V = v;
        adj = new LinkedList[v];
        for(int i= 0 ; i< v ; i++){
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w){
        adj[v].add(w);
    }

    void BFS(int s){
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[s] = true; //current node is visited
        queue.add(s);

        while(queue.size() != 0){
            s = queue.poll();
            System.out.println(s +" ");

            Iterator<Integer> itr = adj[s].iterator();
            while(itr.hasNext()){
                int n = itr.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }

    }


}
