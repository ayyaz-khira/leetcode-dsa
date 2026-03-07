class Solution {

    public boolean dfs(ArrayList<ArrayList<Integer>> adj,int node,int end,boolean vis[]){
        vis[node]=true;
        if(node==end) return true;

        for(int x:adj.get(node)){
            if(!vis[x]){
                if(dfs(adj,x,end,vis)) return true;
            }
        }

        return false;
        
    }


    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        boolean vis[]=new boolean[n];

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int x[]:edges){
            int u=x[0];
            int v=x[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        return dfs(adj,source,destination,vis);


    }
}