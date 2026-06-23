class Solution {
    public String makeGood(String s) {
        char[] chars = s.toCharArray();
        StringBuilder stack = new StringBuilder();
        boolean remove=false;
        for(char c:chars){
            int len = stack.length();
            if (len > 0 &&
                Math.abs(stack.charAt(len - 1) - c) == 32) {
                stack.deleteCharAt(len - 1);
            } else {
                stack.append(c);
            }

        }
        return stack.toString();
        
    }
}