class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums2.length;i++){
            while(!stk.isEmpty() && nums2[stk.peek()]<nums2[i]){
                map.put(nums2[stk.pop()],nums2[i]);
            }
            stk.push(i);
        }

        int res[]=new int[nums1.length];
        int j=0;
        for(int x:nums1){
            res[j]=map.getOrDefault(x,-1);
            j++;
        }

        return res;
        
    }
}