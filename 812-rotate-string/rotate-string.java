class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        String result=s+s;
        if(result.indexOf(goal)!=-1) return true;

        return false;
        
        
    }
}