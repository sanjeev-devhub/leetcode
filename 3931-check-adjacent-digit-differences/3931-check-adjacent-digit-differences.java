class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {

        for(int i=0;i<s.length()-1;i++){
            int c=(int) s.charAt(i)-48;
            int c2=(int) s.charAt(i+1)-48;
            if(Math.abs(c-c2)>2){
                return false;
            }

        }

        return true;
        
    }
}