class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int children=g.length;
        int cookies=s.length;
        int i=0;
        int j=0;
        int count=0;
        Arrays.sort(s);
        Arrays.sort(g);

        while(i<children && j<cookies){
            if(s[j]>=g[i]){
                count++;
            i++;
            j++;   
            }
            else{
            j++;
            }
        }


        return count;


    }
}