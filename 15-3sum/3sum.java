class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int n=arr.length;
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(arr);

        for(int k=0;k<n;k++){
            if(k>0 && arr[k]==arr[k-1]) continue;
            int first=arr[k];
            
            int i=k+1;
            int j=n-1;
            int target=-first;
            while(i<j){
                if(arr[i]+arr[j]==target){
                    List<Integer> list=new ArrayList<>(Arrays.asList(first,arr[i],arr[j]));
                    res.add(list);

                    i++;
                    j--;

                    while(i<j && arr[i]==arr[i-1]) i++;
                    while(i<j && arr[j]==arr[j+1]) j--;
                }
                else if(arr[i]+arr[j]>target){
                    j--;
                }
                else{
                    i++;
                }
            }
            
        }


        return res;
    }
}