class Solution {
    public char findTheDifference(String s, String t) {
        char arrS[]=s.toCharArray();
        char arrT[]=t.toCharArray();
        Arrays.sort(arrS);
        Arrays.sort(arrT);
        int i=0,j=0;

        while(i<arrS.length && j<arrT.length){
            if(arrS[i]!=arrT[j]){
                return arrT[j];
            }
            i++;
            j++;
        }


        return arrT[arrT.length-1];

    }
}