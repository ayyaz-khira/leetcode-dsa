class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n=arr.length;
        Deque<Integer> deq=new ArrayDeque<>();
        int res[]=new int[n-k+1];
        int j=0;
        for(int i=0;i<n;i++){
            while(!deq.isEmpty() && deq.peekFirst()<=i-k){
                deq.removeFirst();
            }

            while(!deq.isEmpty() && arr[deq.peekLast()]<=arr[i]){
                deq.removeLast();
            }

            deq.offerLast(i);

            if(i>=k-1){
                res[j++]=arr[deq.peekFirst()];
            }



        }

        return res;
    }
}