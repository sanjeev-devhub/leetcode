class Solution {
    public boolean rotateString(String s, String goal) {
        s=s+s;
        return s.contains(goal); 
    }
}