class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int res[]=new int[n-k+1];
        Deque<Integer> deq=new ArrayDeque<>();
        int j=0;

        for(int i=0;i<n;i++){
            while(!deq.isEmpty() && deq.peekFirst()<=i-k){
                deq.removeFirst();
            }

            while(!deq.isEmpty() && nums[deq.peekLast()]<=nums[i]){
                deq.removeLast();
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