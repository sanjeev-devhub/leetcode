class Solution {
    public long removeZeros(long n) {
        char[] chars =String.valueOf(n).toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c: chars){
            if(c!='0'){
                sb.append(c);
            }
        }
        return Long.parseLong(sb.toString());        
    }
}