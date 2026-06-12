class Solution {

    public void dfs(ArrayList<ArrayList<Integer>> adj, int node, boolean vis[]){
        vis[node]=true;

        for(int x:adj.get(node)){
            if(!vis[x]){
                dfs(adj,x,vis);
                vis[x]=true;
            }
        }
    }


    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;

        int total=0;

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1){
                    adj.get(i).add(j);
                }
                
            }
        }

        boolean vis[]=new boolean[adj.size()];
        for(int i=0;i<n;i++){
            if(!vis[i]){
            dfs(adj,i,vis);
            total+=1;
        }
        }


        return total;


    }
}