class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int count=0;
        int sorted[]=Arrays.copyOf(heights,heights.length);
        Arrays.sort(sorted)
;        for(int i=0;i<n;i++){
            if(heights[i]!=sorted[i]){
                count++;
            }
        }

        return count;
        
    }
}