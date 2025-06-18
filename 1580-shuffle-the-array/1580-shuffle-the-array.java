class Solution {
    public int[] shuffle(int[] nums, int n) {
        int res[]=new int[2*n];

        int j=0;
        int k=1;
        for(int i=0;i<2*n;i++){
            if(i<n){
                res[j]=nums[i];
                j+=2;
            }
            else{
                res[k]=nums[i];
                k+=2;
            }
        }

        return res;
        
        
    }
}