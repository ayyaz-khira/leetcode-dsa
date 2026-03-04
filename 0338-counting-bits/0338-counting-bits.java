class Solution {
    public int[] countBits(int n) {
        int res[]=new int[n+1];
        for(int i=0;i<=n;i++){
            int count=0;
            String s=Integer.toBinaryString(i);
            for(char c:s.toCharArray()){
                if(c=='1') count+=1;
            }
            res[i]=count;
        }


        return res;
    }
}