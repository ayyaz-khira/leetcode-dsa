class Solution {
    public boolean isBipartite(int[][] graph) {
        int V=graph.length;
        Queue<Integer> queue=new LinkedList<>();
        int color[]=new int[V];
        Arrays.fill(color,-1);

        for(int k=0;k<V;k++){
          if(color[k]==-1){
            queue.offer(k);
             color[k]=0;
        while(!queue.isEmpty()){
           
                int node=queue.poll();
                for(int x:graph[node]){
                    if(color[x]==-1){
                        color[x]=1-color[node];
                        queue.offer(x);
                    }
                    else{
                        if(color[x]==color[node]){
                            return false;
                        }
                    }
                }
            
        }
          }
        }


        return true;
        
    }
}