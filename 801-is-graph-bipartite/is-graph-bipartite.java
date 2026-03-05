class Solution {
    public boolean isBipartite(int[][] graph) {
        Queue<Integer> queue=new LinkedList<>();
        int n=graph.length;
        int color[]=new int[n];
        Arrays.fill(color,-1);

        for(int i=0;i<n;i++){
            if(color[i]==-1){

        queue.add(i);
        color[i]=1;

        while(!queue.isEmpty()){
            int node=queue.poll();

            for(int x:graph[node]){
                if(color[x]==-1){
                    color[x]=1-color[node];
                    queue.add(x);
                }
                else if(color[x]==color[node]){
                    return false;
                }
            }
            
        }

            }

        }

        return true;
    }
}