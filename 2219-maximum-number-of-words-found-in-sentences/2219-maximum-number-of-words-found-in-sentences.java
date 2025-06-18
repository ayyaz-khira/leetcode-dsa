class Solution {
    public int mostWordsFound(String[] sentences) {
        HashMap<String,Integer> map=new HashMap<>();
        int count=0;
        int max=0;
        for(String s:sentences){
            count=0;
            for(String str:s.split(" ")){
                count++;
            }
            if(count>max){
                max=count;
            }
        }

        return max;

        
    }
}