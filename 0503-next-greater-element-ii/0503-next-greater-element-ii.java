class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int res[]=new int[nums.length];
        Stack<Integer> stk=new Stack<>();
        Arrays.fill(res,-1);

        for(int i=0;i<2*nums.length;i++){
            while(!stk.isEmpty() && nums[stk.peek()]<nums[i%nums.length]){
                res[stk.pop()]=nums[i%nums.length];
            }

            if(i<nums.length){
            stk.push(i);
            }
        }

        

        return res;
    }
}