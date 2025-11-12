class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n=arr.length;
        int j=0;

        Deque<Integer> deq=new ArrayDeque<>();
        int res[]=new int[n-k+1];

        for(int i=0;i<n;i++){
            while(!deq.isEmpty() && deq.peekFirst()<=i-k){
                deq.removeFirst();
            }
            while(!deq.isEmpty() && arr[i]>=arr[deq.peekLast()]){
                deq.removeLast();
            }
            deq.addLast(i);

            if(i>=k-1){
                res[j]=arr[deq.peekFirst()];
                j++;
            }
        }


        return res;
    }
}