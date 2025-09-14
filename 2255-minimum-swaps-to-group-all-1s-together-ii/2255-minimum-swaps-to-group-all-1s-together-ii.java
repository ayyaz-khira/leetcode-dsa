class Solution {
    public int minSwaps(int[] arr) {
        int curOnes=0;
        int maxOnes=0;
        int totalOnes=0;
        for(int x:arr){if(x==1) totalOnes++;}
        int n=arr.length;
        int l=0;

        if(totalOnes==0 || totalOnes==n) return 0;
         
        for(int r=0;r<2*n;r++){
            if(arr[r%n]==1) curOnes++;
            
            if((r-l+1)>totalOnes){
                curOnes-=arr[l%n];
                l++;
            }
            maxOnes=Math.max(maxOnes,curOnes);
            
        }
        
        return totalOnes-maxOnes;
    }
}