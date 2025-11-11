class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String concat="";
        for(String x:words){
            
            concat+=x.charAt(0);

        }

        if(s.equals(concat)) return true;

        return false;
    }
}