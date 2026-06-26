class Solution {
    public int passwordStrength(String password) {
        int score=0;
        Set<Character> set = new HashSet<>();
        for(char c:password.toCharArray()){
            set.add(c);
        }

        for(Character c:set){
            if(Character.isAlphabetic(c)){
                if(c>='A' && c<='Z'){
                    score+=2;
                }else{
                    score+=1;
                }
                
            }else if(Character.isDigit(c)){
                score+=3;
            }else{
                score+=5;
            }
        }

        return score;
        
    }
}