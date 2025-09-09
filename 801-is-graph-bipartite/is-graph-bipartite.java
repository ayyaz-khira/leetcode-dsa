class Solution {
    public boolean isBipartite(int[][] graph) {

        Queue<Integer> queue=new LinkedList<>();
        int color[]=new int[graph.length];
        Arrays.fill(color,-1);

        for(int i=0;i<graph.length;i++){
            if(color[i]==-1){
                color[i]=1;
                queue.offer(i);

                while(!queue.isEmpty()){
                    int node=queue.poll();
                    for(int x:graph[node]){
                        if(color[x]==-1){
                            color[x]=1-color[node];
                            queue.offer(x);
                        }
                        else if(color[x]==color[node]) return false;
                    }
                }
            }
        }


        return true;
        
    }
}