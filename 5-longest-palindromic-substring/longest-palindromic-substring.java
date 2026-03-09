class Solution {

    public int isPalindrome(char arr[],int i,int j,int n){
        int length=1;
        while(i>=0 && j<n && arr[i]==arr[j]){
            length=Math.max(length,j-i+1);
            i--;
            j++;
        }


        return length;

    }


    public String longestPalindrome(String s) {
        int n=s.length();
        char arr[]=s.toCharArray();
        int max=1;
        int length=1;
        int start=0;
        int end=0;

        for(int i=0;i<n;i++){
            
            length=isPalindrome(arr,i,i,n);
            if(length>max){
                max=length;
                start=i-((length-1)/2);
                end=i+((length)/2);
            }

            length=isPalindrome(arr,i,i+1,n);
            if(length>max){
                max=length;
                start=i-((length-1)/2);
                end=i+((length)/2);

            }

            
        }


        return s.substring(start,end+1);
    }
}