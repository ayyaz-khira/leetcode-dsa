class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int candidate1=0;
        int candidate2=0;
        int count1=0;
        int count2=0;
        int n=nums.length;

        for(int x:nums){
            if(x==candidate1){
                count1++;
            }
            else if(x==candidate2){
                count2++;
            }
            else if(count1==0){
                candidate1=x;
                count1=1;
            }
            else if(count2==0){
                candidate2=x;
                count2=1;
            }
            else{
                count1--;
                count2--;
            }


        }

        count1=0;
        count2=0;

        for(int x:nums){
            if(x==candidate1) count1++;
            if(x==candidate2) count2++;

        }


        if(count1>n/3) list.add(candidate1);


        if(count2 > n/3 && candidate2 != candidate1)
        list.add(candidate2);


        return list;
    }
}