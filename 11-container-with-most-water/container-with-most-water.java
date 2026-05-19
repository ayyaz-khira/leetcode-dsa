class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxArea=0;

        int l=0;
        int r=height.length-1;

        while(l<r){
            int width=r-l;
            int h=Math.min(height[l],height[r]);
            maxArea=Math.max(maxArea,width*h);

            if(height[l]<height[r]){
                l++;
            }
            else if(height[l]>height[r]){
                r--;
            }
            else{
                l++;
                r--;
            }
        }


        return maxArea;


        

    }
}