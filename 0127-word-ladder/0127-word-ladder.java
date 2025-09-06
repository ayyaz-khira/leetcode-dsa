class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set=new HashSet<>();
        Queue<String> queue=new LinkedList<>();

        if(!wordList.contains(endWord)){
            return 0;
        }

        for(String x:wordList){
            set.add(x);
        }

        int depth=1;
        queue.offer(beginWord);

        while(!queue.isEmpty()){
            int size=queue.size();
            for(int k=0;k<size;k++){
                String word=queue.poll();
                char arr[]=word.toCharArray();
                for(int i=0;i<word.length();i++){
                    char temp=arr[i];
                    for(char j='a';j<='z';j++){
                        arr[i]=j;
                        String newWord=String.valueOf(arr);
                        if(j==temp) continue;
                        if(set.contains(newWord)){
                            queue.offer(newWord);
                            set.remove(newWord);
                        }
                        if(newWord.equals(endWord)) return depth+1;
                    }
                    arr[i]=temp;
                }
            }


            depth++;
        }


        return 0;


    }
}