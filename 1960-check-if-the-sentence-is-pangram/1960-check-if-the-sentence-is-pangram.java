class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set=new HashSet<>();

        for(char c:sentence.toLowerCase().replaceAll("[^a-z]","").toCharArray()){
            set.add(c);
        }

        if(set.size()==26) return true;

        return false;
        
    }
}