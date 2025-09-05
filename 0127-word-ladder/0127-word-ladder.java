class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue=new LinkedList<>();
        HashSet<String> set=new HashSet<>();

        for(String x:wordList){
            set.add(x);
        }

        if(!set.contains(endWord)) return 0;

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
                        if (j == temp) continue;
                        arr[i]=j;
                        String newWord=String.valueOf(arr);
                        if(newWord.equals(endWord)) return depth+1;
                        if(set.contains(newWord)){
                            queue.offer(newWord);
                            set.remove(newWord);
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