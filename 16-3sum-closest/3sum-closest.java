class Solution {
    public int threeSumClosest(int[] arr, int target) {
        int n=arr.length;
        Arrays.sort(arr);
        int closest=0;
        int sum=0;
        int diff=Integer.MAX_VALUE;
    

        for(int k=0;k<n;k++){
            if(k>0 && arr[k]==arr[k-1]) continue;

            int first=arr[k];
            int i=k+1;
            int j=n-1;

            while(i<j){
                sum=arr[i]+arr[j]+first;
                if(sum==target) return sum;
                else if(sum<target) i++;
                else j--;


                if(Math.abs(target-sum)<diff){
                    diff=Math.abs(target-sum);
                    closest=sum;
                }

            }

        }
            return closest;
    }
}