class Solution {
    public boolean isPalindrome(int x) {
        int orig=x;
        int sum=0;

        while(x>0){
            int rem=x%10;
            sum=sum*10+rem;
            x/=10;
        }

        return orig==sum;
    }
}