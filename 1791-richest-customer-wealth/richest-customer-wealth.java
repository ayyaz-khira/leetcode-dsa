class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int sum=0;
        int max=0;

        for(int arr[]:accounts){
            sum=0;
            for(int x: arr){
                sum+=x;
            }
            max=Math.max(max,sum);
        }

        return max;
    }
}