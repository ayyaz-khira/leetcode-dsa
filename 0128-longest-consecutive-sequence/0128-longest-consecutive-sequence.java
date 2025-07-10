class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int x:arr){
            set.add(x);
        }
        
        int max=0;
        for(int num:set){
            int curNum=num;
            int curLongest=1;
            if(!set.contains(num-1)){
                while(set.contains(curNum+1)){
                    curNum++;
                    curLongest++;
                }
            }
            
            max=Math.max(max,curLongest);
        }
        
        
        return max;
    }
}