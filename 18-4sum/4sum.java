class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> res=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);

        for(int k=0;k<n;k++){
            if(k>0 && arr[k]==arr[k-1]) continue;
            int firstEl=arr[k];
            for(int m=k+1;m<n-1;m++){
                if(m>k+1 && arr[m]==arr[m-1]) continue;
                int secondEl=arr[m];
                int third=m+1;
                int fourth=n-1;

                while(third<fourth){
                    long sum=(long)firstEl+secondEl+arr[third]+arr[fourth];
                    if(sum==target){
                        List<Integer> list=new ArrayList<>(Arrays.asList(firstEl,secondEl,arr[third],arr[fourth]));
                        res.add(list);

                        third++;
                        fourth--;

                        while(third<fourth && arr[third]==arr[third-1]) third++;
                        while(third<fourth && arr[fourth]==arr[fourth+1]) fourth-- ;

                    }
                    else if(sum<target){
                        third++;
                    }
                    else{
                        fourth--;
                    }
                }
            }
           

        }


        return res;
    }
}