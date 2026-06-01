class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
        int res[]=new int[nums1.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stk=new Stack<>();

        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && nums2[i]>nums2[stk.peek()]){
                map.put(nums2[stk.pop()],nums2[i]);
            }
            stk.push(i);
        }

        int i=0;
        for(int x:nums1){
            res[i++]=map.getOrDefault(x,-1);
        }

        return res;
    }
}