
class Pair{
        int dist;
        int node;
        
        Pair(int dist,int node){
            this.dist=dist;
            this.node=node;
        }
}


class Solution {



    
    public int networkDelayTime(int[][] times, int n, int k) {

        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.dist - b.dist);
        
        
        
        for(int i=0;i<n+1;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<times.length;i++){
            int u=times[i][0];
            int v=times[i][1];
            int dist=times[i][2];
            adj.get(u).add(new Pair(dist,v));
            
        }
        
        pq.add(new Pair(0,k));
        int res[]=new int[n+1];
        Arrays.fill(res,Integer.MAX_VALUE);
        res[k]=0;
        
        
        while(!pq.isEmpty()){
            Pair pair=pq.poll();
            int dist=pair.dist;
            int node=pair.node;
            
            for(Pair p:adj.get(node)){
                if(dist+p.dist<res[p.node]){
                    res[p.node]=dist+p.dist;
                    pq.add(new Pair(dist+p.dist,p.node));
                }
            }
        }
        
        int max=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            if(res[i]==Integer.MAX_VALUE) return -1;
            max=Math.max(max,res[i]);
        }
        return max;
        
    }
}