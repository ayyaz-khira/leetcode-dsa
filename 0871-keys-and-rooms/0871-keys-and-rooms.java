class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(0);
        boolean vis[]=new boolean[rooms.size()];
        vis[0]=true;
        int count=0;

        while(!queue.isEmpty()){
            count++;
            int node=queue.poll();
            for(int x:rooms.get(node)){
                if(!vis[x]){
                    vis[x]=true;
                    queue.offer(x);
                }
            }
        }

        return count==rooms.size();
    }
}