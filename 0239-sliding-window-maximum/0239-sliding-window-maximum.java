class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int res[]=new int[n-k+1];
        int j=0;
        Deque<Integer> deque=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!deque.isEmpty() && deque.peekFirst()<=i-k){
                deque.pollFirst();
            }

            while(!deque.isEmpty() && nums[deque.peekLast()]<=nums[i]){
                deque.pollLast();
            }

            deque.offerLast(i);

            if(i>=k-1){
                res[j]=nums[deque.peekFirst()];
                j++;
            }
        }


        return res;
        
        
    }
}