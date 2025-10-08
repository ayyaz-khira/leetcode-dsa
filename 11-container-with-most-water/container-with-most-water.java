class Solution {
    public int maxArea(int[] height) {
        int n=height.length;

        int l=0;
        int r=n-1;
        int max=0;

        while(l<r){
            int h=Math.min(height[l],height[r]);
            int width=r-l;
            max=Math.max(max,h*width);

            if(height[r]<height[l]){
                r--;
            }
            else{
                l++;
            }
            
        }

        return max;
    }
}