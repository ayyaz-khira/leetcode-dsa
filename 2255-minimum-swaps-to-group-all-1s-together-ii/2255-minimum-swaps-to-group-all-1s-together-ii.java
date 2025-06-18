class Solution {
    public int minSwaps(int[] arr) {
     int n=arr.length;
        int l=0;
        int curOnes=0;
        int totalOnes=0;
        int max=0;
        
        for(int x:arr){
            if(x==1){
                totalOnes++;
            }
        }
        
        if(totalOnes==0 || totalOnes==n){
            return 0;
        }
        
        for(int r=0;r<2*n;r++){
            if(arr[r%n]==1){
                curOnes++;
            }
            
            if(r-l+1>totalOnes){
                curOnes-=arr[l%n];
                l+=1;
            }
            
            max=Math.max(max,curOnes);
        }
        
        return totalOnes-max;   
    }
}