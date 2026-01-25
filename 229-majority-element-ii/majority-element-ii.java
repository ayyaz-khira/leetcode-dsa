class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int element1=-1;
        int element2=-1;
        int count1=0;
        int count2=0;

        List<Integer> list=new ArrayList<>();

        for(int x:nums){
            if(count1==0 && x!=element2){
                element1=x;
                count1=1;
            }
            else if(count2==0 && x!=element1){
                element2=x;
                count2=1;
            }
            else if(x==element1){
                count1++;
            }
            else if(x==element2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1=0;
        count2=0;

        for(int x:nums){
            if(x==element1){
                count1++;
            }
            else if(x==element2){
                count2++;
            }
        }

        if(count1>n/3) list.add(element1);
        if(count2>n/3) list.add(element2);

        return list;
    }
}