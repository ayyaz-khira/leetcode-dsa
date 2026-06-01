class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer> stk=new Stack<>();
        int res[]=new int[n];
        Arrays.fill(res,-1);

        for(int k=0;k<2*n;k++){
            int i=k%n;
            while(!stk.isEmpty() && nums[i]>nums[stk.peek()]){
                res[stk.pop()]=nums[i];
            }

            if(k<n){
                stk.push(i);
            }
        }


        return res;
    }
}