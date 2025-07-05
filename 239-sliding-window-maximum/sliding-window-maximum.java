class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> deq = new ArrayDeque<>();
        int res[]=new int[n-k+1];
        int j=0;

        for(int i=0;i<n;i++){
            while(!deq.isEmpty() && deq.peekFirst()<=i-k){
                deq.pollFirst();
            }

            while(!deq.isEmpty() && nums[i]>nums[deq.peekLast()]){
                deq.pollLast();
            }

            deq.offerLast(i);

            if(i>=k-1){
                res[j]=nums[deq.peekFirst()];
                j++;
            }
        }

        return res;
    }
}