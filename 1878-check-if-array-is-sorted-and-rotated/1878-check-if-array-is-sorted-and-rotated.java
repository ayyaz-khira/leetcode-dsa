class Solution {

    public boolean isRotatedAndSorted(int arr[]){
        int n=arr.length;

        int count=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                count++;
            }
        }
        if(arr[n-1]> arr[0]) count++;

        if(count<=1) return true;

        return false;
    }

    public boolean check(int[] nums) {
        return isRotatedAndSorted(nums);
    }
}