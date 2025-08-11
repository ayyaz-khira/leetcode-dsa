class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea=0;
        Stack<Integer> stk=new Stack<>();
        int n=heights.length;

        for(int i=0;i<=n;i++){
            int curHeight=(i==n)? 0 :heights[i];

            while(!stk.isEmpty() && curHeight<heights[stk.peek()]){
                int height=heights[stk.pop()];

                int width=stk.isEmpty()? i :i- stk.peek()-1;

                maxArea=Math.max(maxArea,height*width);
            }

            stk.push(i);
        }

        return maxArea;
        
    }
}