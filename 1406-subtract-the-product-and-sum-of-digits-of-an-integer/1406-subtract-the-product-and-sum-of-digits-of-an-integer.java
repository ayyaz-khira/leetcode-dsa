class Solution {
    public int subtractProductAndSum(int n) {
        int prod=1;
        int sum=0;
        while(n!=0){
            int temp=n%10;
            sum+=temp;
            prod=prod*temp;
            n=n/10;
        }

        return prod-sum;
        
    }
}