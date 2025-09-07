class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set=new HashSet<>();
        Queue<String> queue=new LinkedList<>();
        for(String x:wordList){
            set.add(x);
        }

        if(!wordList.contains(endWord)) return 0;

        queue.offer(beginWord);
        int depth=1;

        while(!queue.isEmpty()){
            int size=queue.size();
            for(int k=0;k<size;k++){
                String word=queue.poll();
                char arr[]=word.toCharArray();
                for(int i=0;i<arr.length;i++){
                    char temp=arr[i];
                    for(char j='a';j<='z';j++){
                        if(temp==j) continue;
                        arr[i]=j;
                        String newWord=String.valueOf(arr);
                        if(newWord.equals(endWord)) return depth+1;
                        if(set.contains(newWord)){
                            set.remove(newWord);
                            queue.offer(newWord);
                        }

                    }
                    arr[i]=temp;
                }
            }
            depth++;
        }



        return 0;

    }
}