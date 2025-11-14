class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int max=0;
        
        int l=0;
        int r=n-1;
        while(l<r){
            int h=Math.min(height[l],height[r]);
            int w=r-l;
            max=Math.max(max,h*w);

            if(height[l]<height[r]){
                l++;

            }
            else{
                r--;
            }
        }

        return max;
    }
}