class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb= new StringBuilder();

        for(char c:s.toCharArray()){
            int len = sb.length()-1;
            if(len>=0){
                if(c==sb.charAt(len))
                sb.deleteCharAt(len);
                else  sb.append(c);
            }else{
                 sb.append(c);
            }
           
            
        }
        return sb.toString();
        
    }
}