class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int max=0;

        while(left<right){
            int h=Math.min(height[left],height[right]);
            int width=right-left;
            max=Math.max(max,h*width);

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }


        return max;
    }
}