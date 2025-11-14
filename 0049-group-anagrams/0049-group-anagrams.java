class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String x:strs){
            char arr[]=x.toCharArray();
            Arrays.sort(arr);
            String key=String.valueOf(arr);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }

            map.get(key).add(x);
        }


        return new ArrayList<>(map.values());
    }
}