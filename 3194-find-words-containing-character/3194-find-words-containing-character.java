class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> l=new ArrayList<>();
        int n=words.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<words[i].length();j++){
                if(words[i].charAt(j)==x){
                    l.add(i);
                    break;
                
                }
            }
        }

        return l;
        
    }
}