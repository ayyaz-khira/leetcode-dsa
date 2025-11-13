class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n=arr.length;
        int res[]=new int[n-k+1];

        Deque<Integer> deq=new ArrayDeque<>();
        int j=0;

        for(int i=0;i<n;i++){
            while(!deq.isEmpty() && i-k>=deq.peekFirst()){
                deq.removeFirst();
            }
        
            while(!deq.isEmpty() && arr[i]>=arr[deq.peekLast()]){
                deq.removeLast();
            }

            deq.add(i);

            if(i>=k-1){
                res[j++]=arr[deq.peekFirst()];
            }
        }


        return res;
    }
}