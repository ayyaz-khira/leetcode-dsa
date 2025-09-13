class Solution {

    public void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean vis[]){
        vis[node]=true;

        for(int x:adj.get(node)){
            if(!vis[x]){
                dfs(x,adj,vis);
            }
        }

    }


    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<isConnected.length;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected.length;j++){
                if(i!=j && isConnected[i][j]==1){
                    adj.get(i).add(j);
            }
            }
        }


        boolean vis[]=new boolean[adj.size()];
        int provinces=0;

        for(int i=0;i<adj.size();i++){
            if(!vis[i]){
                dfs(i,adj,vis);
                provinces++;

            }
        }


        return provinces;


        
    }
}