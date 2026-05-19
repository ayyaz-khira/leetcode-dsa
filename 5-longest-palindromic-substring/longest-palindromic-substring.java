class Solution {

    public int expand(char arr[], int i, int j, int n){
        int len=0;

        while(i>=0 && j<n && arr[i]==arr[j]){
            len=j-i+1;
            i--;
            j++;
        }

        return len;
    }


    public String longestPalindrome(String s) {
        int n=s.length();
        int max=1;
        

        int first=0;
        int second=0;
        int ans=0;
        char arr[]=s.toCharArray();

        for(int i=0;i<n;i++){

            ans=expand(arr,i,i,n);
            if(ans>max){
                max=ans;
                first=i-((max-1)/2);
                second=i+(max/2);
            }

            ans=expand(arr,i,i+1,n);
            if(ans>max){
                max=ans;
                first=i-((max-1)/2);
                second=i+(max/2);

            }
        
        }


        return s.substring(first,second+1);

    }
}