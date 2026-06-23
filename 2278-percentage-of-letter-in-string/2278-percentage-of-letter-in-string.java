class Solution {
    public int percentageLetter(String s, char letter) {
        if(s.isEmpty()) return 0;
        int count=0;
        for(char c:s.toCharArray()){
            if(c==letter){
                count++;
            }
        }
        double per = (double) count /s.length()*100;
        return (int)per;
        
    }
}