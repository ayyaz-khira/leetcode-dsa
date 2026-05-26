class Solution {
    public int[] rearrangeArray(int[] nums) {
        int res[]=new int[nums.length];
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();

        for(int x:nums){
            if(x<0) neg.add(x);
            else pos.add(x);
        }

        int j=0;
        int k=0;
        for(int i=0;i<res.length;i++){
            if(i%2==0) {
                res[i]=pos.get(j);
                j++;
            }
            else 
            {
                res[i]=neg.get(k);
                k++;
            }
        }


        return res;


        

    }
}