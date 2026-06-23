class Solution {
    public String largestOddNumber(String num) {
        StringBuilder sb= new StringBuilder(num);
        char[] chars = num.toCharArray();
        for(int i=chars.length-1;i>=0;i--){
            int n= (int) chars[i]-48;
            if(n%2==1){
                return sb.toString();
            }
                sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
        
    }
}