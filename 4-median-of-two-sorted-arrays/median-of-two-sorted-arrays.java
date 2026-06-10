class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int i=0;
        int j=0;
        int res[]=new int[m+n];
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                res[k++]=nums1[i++];
            }
            else{
                res[k++]=nums2[j++];
            }
        }

        while(i<m){
            res[k++]=nums1[i++];
        }

        while(j<n){
            res[k++]=nums2[j++];

        }

        double sum=0;

        for(double x: res){
            sum+=x;
        }

        if(res.length%2!=0){
            return res[res.length/2];
        }
        

        return (res[res.length/2-1]+res[res.length/2])/2.0;
    }
}