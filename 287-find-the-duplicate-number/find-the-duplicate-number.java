class Solution {
    public int findDuplicate(int[] arr) {
        int n=arr.length;
        
        int slow=arr[0];
        int fast=arr[0];

        do{
            slow=arr[slow];
            fast=arr[arr[fast]];
        }while(fast!=slow);

        slow=arr[0];

        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }

        return slow;


       
        
    }
}