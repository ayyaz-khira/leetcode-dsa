class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int count=0;
        int indegree[]=new int[numCourses];
        Queue<Integer> queue=new LinkedList<>();

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for(int x[]:prerequisites){
            int u=x[0];
            int v=x[1];
            adj.get(u).add(v);

        }

        for(int i=0;i<numCourses;i++){
            for(int x:adj.get(i)){
                indegree[x]++;
            }
        }

        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()){
            count++;
            int node=queue.poll();
            for(int x:adj.get(node)){
                indegree[x]--;
                if(indegree[x]==0){
                    queue.offer(x);
                }
            }
        }


        return count==numCourses;


        
    }
}