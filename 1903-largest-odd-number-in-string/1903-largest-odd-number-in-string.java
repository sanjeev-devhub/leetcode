class Solution {
    public String largestOddNumber(String num) {
        StringBuilder sb= new StringBuilder(num);
        for(int i=num.length()-1;i>=0;i--){
            int n= (int) num.charAt(i)-48;
            if(n%2==1){
                return sb.toString();
            }
                sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
        
    }
}