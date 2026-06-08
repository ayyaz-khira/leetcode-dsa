class Solution {

    public int palindromicSub(char arr[],int i,int j){
        
        int count=0;


        while(i>=0 && j<arr.length && arr[i]==arr[j]){
            count++;
            i--;
            j++;
        }

        return count;
    }

    public int countSubstrings(String s) {
        int n=s.length();
        char arr[]=s.toCharArray();
        int count=0;
        for(int i=0;i<n;i++){
            count+=palindromicSub(arr,i,i);
            count+=palindromicSub(arr,i,i+1);

        }

        return count;
    }
}