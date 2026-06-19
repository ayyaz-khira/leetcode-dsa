class Pair{
    int node;
    int dist;

    Pair(int node,int dist){
        this.node=node;
        this.dist=dist;
    }
}


class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        int level=0;

        int dist[]=new int[n];
        Queue<Pair> queue=new LinkedList<>();
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int edges[]:flights){
            int u=edges[0];
            int v=edges[1];
            int price=edges[2];

            adj.get(u).add(new Pair(v,price));
        }

        queue.add(new Pair(src,0));


        while(!queue.isEmpty() && level<=k){

            int size=queue.size();
            for(int i=0;i<size;i++){
            Pair pair=queue.poll();
            int v=pair.node;
            int cost=pair.dist;



            for(Pair p:adj.get(v)){
                int adjNode=p.node;
                int adjDist=p.dist;

                if(cost+adjDist<dist[adjNode]){
                    dist[adjNode]=cost+adjDist;
                    queue.add(new Pair(adjNode,dist[adjNode]));
                }
            }
            }
            
            level++;
        }


        return dist[dst]==Integer.MAX_VALUE ? -1 : dist[dst];


        
    }
}