class Solution {
    public String frequencySort(String s) {
        int n=s.length();

        List<Character>[] bucket=new ArrayList[n+1];
        HashMap<Character,Integer> map=new HashMap<>();
        String res="";

        for(int i=0;i<bucket.length;i++){
            bucket[i]=new ArrayList<>();
        }

        for(char x:s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(var x:map.entrySet()){
            char key=x.getKey();
            int freq=x.getValue();

            bucket[freq].add(key);
        }

        for(int i=bucket.length-1;i>=0;i--){
            for(char c:bucket[i]){
                res+=String.valueOf(c).repeat(i);
            }
        }


        return res;
    }
}