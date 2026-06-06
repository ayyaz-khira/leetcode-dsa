class Solution {
    public boolean containsDuplicate(int[] arr) {
        
        int n=arr.length;
        
        Arrays.sort(arr);
        
        for(int i=1;i<n;i++){
            if(arr[i-1]==arr[i]){
                return true;
            }
        }
        
        return false;

        
    }
}