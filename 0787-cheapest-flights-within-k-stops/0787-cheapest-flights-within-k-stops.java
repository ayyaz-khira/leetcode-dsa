class Solution {

    class Pair{
        int node;
        int dist;

        Pair(int node,int dist){
            this.node=node;
            this.dist=dist;
        }
    }


    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<flights.length;i++){
            int u=flights[i][0];
            int v=flights[i][1];
            int cost=flights[i][2];

            adj.get(u).add(new Pair(v,cost));
        
        }

        int level=0;
        Queue<Pair> queue=new LinkedList<>();

        int res[]=new int[n];
        Arrays.fill(res,Integer.MAX_VALUE);

        queue.add(new Pair(src,0));

        while(!queue.isEmpty() && level<=k){

            int size=queue.size();
            for(int i=0;i<size;i++){

            Pair pair=queue.poll();
            int node=pair.node;
            int dist=pair.dist;

            for(Pair poll:adj.get(node)){
                int pollNode=poll.node;
                int pollDist=poll.dist;

                if(pollDist+dist<res[pollNode]){
                    res[pollNode]=pollDist+dist;
                    queue.offer(new Pair(pollNode,res[pollNode]));
                }
            }

            }
            level+=1;


        }


        return res[dst]==Integer.MAX_VALUE ? -1 : res[dst];

        
    }
}