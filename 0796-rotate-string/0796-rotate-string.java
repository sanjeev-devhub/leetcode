class Solution {
    public boolean rotateString(String s, String goal) {
       String rotation=s+s;
            if(s.length()!=goal.length())
            {
                return false;
            }
            if(rotation.contains(goal))
            {
                return true;
            }
        return false;
    }
}