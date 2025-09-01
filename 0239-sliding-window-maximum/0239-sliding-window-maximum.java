class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        Deque<Integer> deque=new ArrayDeque<>();
        int res[]=new int[n-k+1];
        int j=0;

        for(int i=0;i<n;i++){
            while(!deque.isEmpty() && deque.peekFirst()<=i-k){
                deque.removeFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()]<=nums[i]){
                deque.removeLast();
            }

            deque.offerLast(i);

            if(i>=k-1){
                res[j++]=nums[deque.peekFirst()];
            }
        }


        return res;
    }
}