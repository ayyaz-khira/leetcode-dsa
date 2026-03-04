class Solution {
    public int hammingWeight(int n) {
        String bin=Integer.toBinaryString(n);
        int count=0;
        for(char c:bin.toCharArray()){
            if(c=='1'){
                count+=1;
            }
        }


        return count;
    }
}