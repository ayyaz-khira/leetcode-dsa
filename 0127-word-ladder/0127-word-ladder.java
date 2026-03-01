class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)) return 0;
        HashSet<String> set=new HashSet<>();
        for(String x:wordList){
            set.add(x);
        }

        Queue<String> queue=new LinkedList<>();
        queue.add(beginWord);
        int count=1;

        while(!queue.isEmpty()){
            int size=queue.size();

            for(int i=0;i<size;i++){
                String word=queue.poll();
                char arr[]=word.toCharArray();
                for(int j=0;j<arr.length;j++){
                    char temp=arr[j];
                    for(char c='a';c<='z';c++){
                        arr[j]=c;
                        String newWord=String.valueOf(arr);
                        if(newWord.equals(endWord)) return count+1;
                        if(set.contains(newWord)) {queue.add(newWord); set.remove(newWord);}
                        
                    }
                    arr[j]=temp;
                }

            }
            count+=1;
        }

        return 0;
    }
}