class Solution {
    public int removeDuplicates(int[] arr) {
        int n=arr.length;
        int j=0;

        for(int i=1;i<n;i++){
            if(arr[i]!=arr[j]){
                arr[j+1]=arr[i];
                j++;
            }
        }


        return j+1;
    }
}