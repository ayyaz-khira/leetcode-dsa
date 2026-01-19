class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos=0;
        int neg=1;
        int n=nums.length;
        int res[]=new int[n];

        for(int num:nums){
            if(num>0){
                res[pos]=num;
                pos+=2;
            }
            else{
                res[neg]=num;
                neg+=2;
            }
        }


        return res;
    }
}