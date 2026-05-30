class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[]=new int[nums1.length];


        Stack<Integer> stk=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums2.length;i++){

            while(!stk.isEmpty() && nums2[i]>=stk.peek()){
                map.put(stk.pop(),nums2[i]);
            }
            stk.push(nums2[i]);

        }

        int i=0;

        for(int x:nums1){
            
                res[i++]=map.getOrDefault(x,-1);
            
        }


        return res;
    
    }
}