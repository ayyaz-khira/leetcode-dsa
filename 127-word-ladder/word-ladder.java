class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set=new HashSet<>();
        for(String x:wordList){
            set.add(x);
        }
        if(!set.contains(endWord)) return 0;

        Queue<String> queue=new LinkedList<>();
        queue.add(beginWord);
        int level=1;
        while(!queue.isEmpty()){
            int size=queue.size();

            
            for(int k=0;k<size;k++){

            String word=queue.poll();
            for(int i=0;i<word.length();i++){
                char arr[]=word.toCharArray();
                char temp=arr[i];

                for(char c='a';c<='z';c++){
                    if(c==temp) continue;
                    arr[i]=c;

                    String newWord=new String(arr);

                    if(newWord.equals(endWord)) return level+1;
                    if(set.contains(newWord)){
                        queue.add(newWord);
                        set.remove(newWord);
                    }
                }

                arr[i]=temp;
            }
            }

            level+=1;
        }


        return 0;        
    }
}