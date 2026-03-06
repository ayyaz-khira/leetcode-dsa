class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Queue<Integer> queue=new LinkedList<>();
        int indegree[]=new int[numCourses];
        int count=0;

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for(int x[]:prerequisites){
            int a=x[0];
            int b=x[1];
            adj.get(b).add(a);
        }

        for(int i=0;i<numCourses;i++){
            for(int x:adj.get(i)){
                indegree[x]+=1;
            }
        }

        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }

        while(!queue.isEmpty()){
            int node=queue.poll();

            for(int x:adj.get(node)){
                indegree[x]-=1;
                if(indegree[x]==0){
                    queue.offer(x);
                }
            }

            count+=1;
        }


        return numCourses==count ? true : false;
    }
}