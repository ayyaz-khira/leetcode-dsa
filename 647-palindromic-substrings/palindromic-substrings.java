class Solution {

    public int expand(char arr[], int l, int r){
        int count=0;

        while(l>=0 && r<arr.length && arr[l]==arr[r]){
            count+=1;
            l--;
            r++;
        }


        return count;
    }


    public int countSubstrings(String s) {
        int n=s.length();
        char arr[]=s.toCharArray();
        int count=0;
        for(int i=0;i<n;i++){
            count+=expand(arr,i,i);
            count+=expand(arr,i,i+1);

        }


        return count;
    }
}