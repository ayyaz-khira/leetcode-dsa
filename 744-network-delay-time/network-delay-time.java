class Pair{
    int to;
    int dist;
    
    Pair(int to, int dist){
        this.to=to;
        this.dist=dist;
    }
    
}


class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.dist-b.dist);
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int edge[]:times){
            int u=edge[0];
            int v=edge[1];
            int wt=edge[2];
            
            adj.get(u).add(new Pair(v,wt));
        }
        
        int dist[]=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        
        pq.add(new Pair(k,0));
        
        dist[k]=0;
        
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            int v=p.to;
            int d=p.dist;
            if(d>dist[v]) continue;
            
            for(Pair pair:adj.get(v)){
                int adjNode=pair.to;
                int adjDist=pair.dist;
                if(d+adjDist<dist[adjNode]){
                    dist[adjNode]=d+adjDist;
                    pq.add(new Pair(adjNode,dist[adjNode]));
                };
            }
        }
        
        int max=0;
        for(int i=1;i<=n;i++){
            if(dist[i]==Integer.MAX_VALUE) return -1;
            max=Math.max(max,dist[i]);
        }


        return max;
        
        
    }
}