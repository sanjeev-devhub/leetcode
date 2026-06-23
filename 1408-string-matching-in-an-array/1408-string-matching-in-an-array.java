class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> answer = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            int count =0;
            for(int j=0;j<words.length;j++){
                if(words[j].contains(words[i])){
                    count++;
                }
            }
            if(count>1){
                answer.add(words[i]);
            }
        }
        return answer;
    }
}