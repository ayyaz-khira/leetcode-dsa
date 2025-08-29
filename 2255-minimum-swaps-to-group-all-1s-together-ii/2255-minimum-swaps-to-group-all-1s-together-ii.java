class Solution {
    public int minSwaps(int[] arr) {
        int n=arr.length;
        int totalOnes=0;
        for(int i=0;i<n;i++){
            if(arr[i%n]==1){
                totalOnes++;
            }
        }
        
        int max=0;
        
        if(totalOnes==0 || totalOnes==n) return 0;
        int curOnes=0;
        int l=0;
        
        
        
        for(int i=0;i<2*n;i++){
            if(arr[i%n]==1) curOnes++;
            
            if((i-l+1)>totalOnes){
                curOnes-=arr[l%n];
                l++;
            }
            
            max=Math.max(curOnes,max);
        }
        
        
        return totalOnes-max;
    }
}