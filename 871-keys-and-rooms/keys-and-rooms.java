class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(0);
        boolean vis[]=new boolean[rooms.size()];
        int count=0;
        vis[0]=true;

        while(!queue.isEmpty()){
            int node=queue.poll();
            for(int x:rooms.get(node)){
                if(!vis[x]){
                    vis[x]=true;
                    queue.add(x);

                }
            }

            count++;
        }


        return count==rooms.size();
        
    }
}