class Solution {
    public int minSwaps(int[] arr) {
        int n=arr.length;
        
        int totalOnes=0;
        int curOnes=0;
        int l=0;
        int max=0;
        
        
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                totalOnes++;
            }
        }

        
        if(totalOnes==0 || totalOnes==n) return 0;
        
        for(int r=0;r<2*n;r++){
            if(arr[r%n]==1){
                curOnes++;
            }
            
            if(r-l+1>totalOnes){
                curOnes-=arr[l%n];
                l++;
            }
            
            max=Math.max(max,curOnes);
        }
        return totalOnes-max;
        
    }
}