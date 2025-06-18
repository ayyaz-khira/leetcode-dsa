class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int x:nums1){
            set1.add(x);
        }
        for(int x:nums2){
            set2.add(x);
        }

        set1.retainAll(set2);
        int arr[]=new int[set1.size()];
        int i=0;
        for(int x:set1){
            arr[i]=x;
            i++;
        }

        return arr;

    }
}