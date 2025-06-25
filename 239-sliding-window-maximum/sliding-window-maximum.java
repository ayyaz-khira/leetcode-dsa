class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        Deque<Integer> deq=new ArrayDeque<>();
        int n=arr.length;
        int[] res=new int[n-k+1];
        int j=0;

        for(int i=0;i<n;i++){
            while(!deq.isEmpty() && deq.peekFirst()<=i-k){
                deq.pollFirst();
            }
            while(!deq.isEmpty() && arr[deq.peekLast()]<=arr[i]){
                deq.pollLast();
            }

            deq.offerLast(i);

            if(i>=k-1){
                res[j]=arr[deq.peekFirst()];
                j++;
            }
        }


        return res;
    }
}