class Solution {

    public int expand(char arr[], int i, int j){
        int len=0;
        while(i>=0 && j<=arr.length-1 && arr[i]==arr[j]){
            len=j-i+1;
            i--;
            j++;
        }


        return len;


    }


    public String longestPalindrome(String s) {
        int n=s.length();
        int len=1;
        int max=1;
        int l=0;
        int r=0;


        for(int i=0;i<n;i++){

            len=expand(s.toCharArray(),i,i);
            if(len>max){
            l= i-((len-1)/2);
            r=i+(len/2);
            max=len;

            }
            


            len=expand(s.toCharArray(),i,i+1);
            if(len>max){
            l= i-((len-1)/2);
            r=i+(len/2);
            max=len;

            }
            
        }


        return s.substring(l,r+1);
    }
}