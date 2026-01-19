class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;

        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();

        for(int x:nums){
            if(x<0){
                neg.add(x);
            }
            else if(x>0){
                pos.add(x);
            }
        }


        int res[]=new int[n];
        
        int k=0;
        for(int i=0;i<pos.size();i++){
            res[k++]=pos.get(i);
            res[k++]=neg.get(i);
        }


        return res;

    }
}