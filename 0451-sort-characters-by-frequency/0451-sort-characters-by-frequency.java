class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        List<Character>[] bucket=new ArrayList[n+1];
        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder res=new StringBuilder();
        

        for(int i=0;i<bucket.length;i++){
            bucket[i]=new ArrayList<>();
        }
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(var x:map.entrySet()){
            char key=x.getKey();
            int freq=x.getValue();
            bucket[freq].add(key);
        }

        for(int i=bucket.length-1;i>=0 && n>0;i--){
            for(char x:bucket[i]){
                res.append(String.valueOf(x).repeat(i));
                n--;
            }
        }
    return res.toString();
    }


}