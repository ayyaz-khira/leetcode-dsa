class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
        int res[]=new int[nums1.length];
        Stack<Integer> stk=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && nums2[stk.peek()]<nums2[i]){
                map.put(nums2[stk.pop()],nums2[i]);
            }
            stk.push(i);
        }


        for(int i=0;i<nums1.length;i++){
            res[i]=map.getOrDefault(nums1[i],-1);
            
        }


        return res;
        
        
        
    }
}