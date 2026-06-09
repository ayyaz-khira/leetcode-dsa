class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        
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
            res.add(x);

            for(int y:adj.get(x)){
                indegree[y]-=1;
                if(indegree[y]==0){
                    queue.add(y);
                }

            }

            count+=1;
        }

        int arr[]=new int[res.size()];
        int i=0;

        for(int x:res){
            arr[i++]=x;
        }
        return numCourses==count ? arr : new int[]{};
    }
}