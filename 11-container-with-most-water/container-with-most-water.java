class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int area=0;
        int l=0;
        int r=height.length-1;

        while(l<r){
            int h=Math.min(height[l],height[r]);
            int width=r-l;
            area=Math.max(area,width*h);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }

        return area;
        
        
    }
}