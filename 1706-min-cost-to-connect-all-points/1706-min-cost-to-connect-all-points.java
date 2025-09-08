class Solution {

    static int find(int node,int parent[]){
        if(node==parent[node]){
            return node;
        }
        
        return parent[node]=find(parent[node],parent);
    }
    
    
    static void union(int u1,int v1,int parent[],int rank[]){
        int u=find(u1,parent);
        int v=find(v1,parent);
        
        if(u!=v){
            if(rank[u]<rank[v]){
                parent[u]=v;
            }
            else if(rank[v]<rank[u]){
                parent[v]=u;
            }
            else{
                parent[v]=u;
                rank[u]++;
            }
        }
    }
    


    public int minCostConnectPoints(int[][] points) {

        int rows=points.length;
        List<int[]> edges=new ArrayList<>();

        for(int i=0;i<rows;i++){
            for(int j=i+1;j<rows;j++){
                int x1=points[i][0];
                int y1=points[i][1];
                int x2=points[j][0];
                int y2=points[j][1];
                int dist=Math.abs(x2-x1)+Math.abs(y2-y1);
                edges.add(new int[]{i,j,dist});
            }
        }



        Collections.sort(edges,(a,b)->a[2]-b[2]);
        int rank[]=new int[points.length];
        int parent[]=new int[points.length];
        int min=0;
        
        for(int i=0;i<points.length;i++){
            parent[i]=i;
        }
        
        Arrays.fill(rank,0);
        
        for(int i=0;i<edges.size();i++){
            int u=edges.get(i)[0];
            int v=edges.get(i)[1];
            int wt=edges.get(i)[2];
            
            int parent_u=find(u,parent);
            int parent_v=find(v,parent);
            
            if(parent_u!=parent_v){
                min+=wt;
                union(parent_u,parent_v,parent,rank);
            }
            
            
        }
        
        
        return min;



        
    }
}