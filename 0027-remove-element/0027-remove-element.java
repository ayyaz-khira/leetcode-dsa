class Solution {

    public void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }




    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int j=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==val){
                j=i;
                break;
            }
        }


        if(j==-1) return n;

        for(int i=j+1;i<n;i++){
            if(nums[i]!=val){
                swap(nums,i,j);
                j++;
            }
        }


        return j;
        
    }
}