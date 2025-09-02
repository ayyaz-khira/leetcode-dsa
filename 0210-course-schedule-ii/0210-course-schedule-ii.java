class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int count=0;
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for(int x[]:prerequisites){
            int u=x[1];
            int v=x[0];

            adj.get(u).add(v);

        }

        int indegree[]=new int[numCourses];

        for(int i=0;i<numCourses;i++){
            for(int x:adj.get(i)){
                indegree[x]++;
            }
        }

        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){

                queue.offer(i);
            }
        }

        int topo[]=new int[numCourses];
        int ind=0;
        while(!queue.isEmpty()){
            count++;
            int node=queue.poll();
            topo[ind]=node;
            ind++;

            for(int x:adj.get(node)){
                indegree[x]--;
                if(indegree[x]==0){
                    queue.offer(x);
                }
            
                
            }
        }


        return count==numCourses ? topo : new int[]{};

        
    }
}