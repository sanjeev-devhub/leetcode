class Solution {
    public boolean areNumbersAscending(String s) {

        String[] str = s.split(" ");
        List<Integer> list = new ArrayList<>();
        for(String s1:str){
            if(Character.isDigit(s1.charAt(0))){
                list.add(Integer.parseInt(s1));
            }
        }
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1)){
                return false;
            }
        }

        return true;
        
    }
}