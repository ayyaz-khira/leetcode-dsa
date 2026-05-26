class Solution {
    public int[] rearrangeArray(int[] nums) {
        int res[]=new int[nums.length];
        int n=nums.length;
        int pos=0;
        int neg=1;

        for(int x:nums){
            if(x<0){
                res[neg]=x;
                neg+=2;
            }
            else{
                res[pos]=x;
                pos+=2;
            }
        }


        return res;
    }
}