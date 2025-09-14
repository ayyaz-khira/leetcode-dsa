class Solution {
    public int largestRectangleArea(int[] arr) {
        int n=arr.length;
        Stack<Integer> stk=new Stack<>();
        int max=0;

        for(int i=0;i<=n;i++){
            int curHeight=(i==n)? 0 : arr[i];

            while(!stk.isEmpty() && curHeight<arr[stk.peek()]){
                int height=arr[stk.pop()];

                int width=(stk.isEmpty())? i : i-stk.peek()-1;

                max=Math.max(max,height*width);
            }

            stk.push(i);
        }

        return max;
        

        
    }
}