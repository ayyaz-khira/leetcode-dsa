class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int n=arr.length;
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(arr);
        

        for(int k=0;k<n;k++){
            if(k>0 && arr[k]==arr[k-1]) continue;

            int first=arr[k];
            int target=-first;
            int i=k+1;
            int j=n-1;

            while(i<j){
                if(arr[i]+arr[j]==target){
                    List<Integer> list=new ArrayList<Integer>(Arrays.asList(first,arr[i],arr[j]));
                    res.add(list);

                    i++;
                    j--;

                    while(i>0 && i<n && arr[i-1]==arr[i]) i++; 
                    while(j>0 && j<n && arr[j+1]==arr[j]) j--; 

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