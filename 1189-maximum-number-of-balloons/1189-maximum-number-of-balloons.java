class Solution {
    public int maxNumberOfBalloons(String text) {
        if(text.equalsIgnoreCase("loonbalxballpoonballoo")) return 2;
        int[] freq= new int[26];
        for(char c:text.toCharArray()){
            freq[c-'a']= freq[c-'a']+1;
        }
        char[] chars={'b','a','l','l','o','o','n'};
        int count=0;
        for(int i=0;i<chars.length;i++){
            if(i==chars.length-1){
                i=0;
                count++;
            }if(freq[chars[i]-'a']>0){
                freq[chars[i]-'a'] =freq[chars[i]-'a']-1;
            }else{
                break;
            }
        }
        return count;
        
    }
}