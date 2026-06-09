class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

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
            queue.add(i);
            }
        }


        int count=0;

        while(!queue.isEmpty()){
            
            int x=queue.poll();

            for(int y:adj.get(x)){
                indegree[y]-=1;
                if(indegree[y]==0){
                    queue.add(y);
                }

            }

            count+=1;
        }


        return count==numCourses;


    }
}