class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        Deque<Integer> deque=new ArrayDeque<>();
        int n=arr.length;
        int res[]=new int[n-k+1];
        int j=0;
        for(int i=0;i<n;i++){

            while(!deque.isEmpty() && deque.peekFirst()<=i-k){
                deque.removeFirst();
            }

            while(!deque.isEmpty() && arr[deque.peekLast()]<arr[i]){
                deque.removeLast();
            }

            deque.offer(i);

            if(i>=k-1){
                res[j]=arr[deque.peek()];
                j++;
            }

        }

        return res;
    }
}