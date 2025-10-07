class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> stk=new Stack<>();
        int max=0;

        for(int i=0;i<=n;i++){
            int curHeight=(i==n)? 0:heights[i];

            while(!stk.isEmpty() && curHeight<heights[stk.peek()]){
                int height=heights[stk.pop()];
                int width=stk.isEmpty()? i : i-stk.peek()-1;
                max=Math.max(max,height*width);
            }
            stk.push(i);
        }

        return max;
    }
}