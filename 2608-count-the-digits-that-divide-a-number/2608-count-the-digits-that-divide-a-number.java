class Solution {
    public int countDigits(int num) {
        int count=0;
        int orig=num;
        while(num!=0){
            int temp=num%10;
            if(orig%temp==0){
                count++;
            }
            num=num/10;
        }


        return count;
        
    }
}