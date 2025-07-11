class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map=new HashMap<>();

        int n=strs.length;

        for(String s:strs){
            char arr[]=s.toCharArray();
            Arrays.sort(arr);
            String str=new String(arr);

            if(!map.containsKey(str)){
                map.put(str,new ArrayList<>());
            }

            map.get(str).add(s);

        }


        List<List<String>> res=new ArrayList<>();
        for(List<String> x:map.values()){
            res.add(x);
        }
        return res;
        
    }
}