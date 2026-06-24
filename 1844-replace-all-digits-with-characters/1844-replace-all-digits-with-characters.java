class Solution {
    public String replaceDigits(String s) {
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i += 2) {
            int val = chars[i] - 48;
            char c = chars[i - 1];
            chars[i] = (char) (c + val);
        }
        return new String(chars);       
    }
}