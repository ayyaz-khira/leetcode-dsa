class Solution {
    public String firstPalindrome(String[] words) {
        
        for(String s:words){
            char arr[]=s.toCharArray();
            if(palindrome(arr)){
                String str=new String(arr);
                return str;
            }
        }

        return "";


        
    }

    public static boolean palindrome(char arr[]){
        int l=0;
        int r=arr.length-1;
        while(l<r){
            if(arr[l]!=arr[r]){
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}