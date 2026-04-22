class Node{
    int val;
    int dist;

    Node(int val, int dist){
        this.val=val;
        this.dist=dist;
    }
}



class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Node>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Node>());
        }

        int dist[]=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        int level=0;

        Queue<Node> queue=new LinkedList<>();
        queue.add(new Node(src,0));

        for(int i=0;i<flights.length;i++){
            int poll[]=flights[i];
            int u=poll[0];
            int v=poll[1];
            int price=poll[2];
            adj.get(u).add(new Node(v,price));
        }

        while(!queue.isEmpty() && level<=k){

            

            int size=queue.size();
            for(int i=0;i<size;i++){
                Node poll=queue.poll();
                int node=poll.val;
                int price=poll.dist;

                
                
                for(Node newNode:adj.get(node)){
                    int newnode=newNode.val;
                    int newDist=newNode.dist;
                    if(price+newDist<dist[newnode]){
                    queue.add(new Node(newNode.val,price+newNode.dist));
                    dist[newnode]=price+newDist;

                    }
                }
              
            }
            level+=1;

        }



        return dist[dst]==Integer.MAX_VALUE ? -1 : dist[dst];

        
    }
}