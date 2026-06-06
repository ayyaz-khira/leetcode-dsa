class Solution {
    public int majorityElement(int[] arr) {
        int n=arr.length;

        int count=0;
        int candidate=0;
        for(int x:arr){

            if(count==0){
                candidate=x;
            }



            if(x==candidate){
            count++;
            }
            else{
                count--;
            }
        }

        return candidate;

    }
}