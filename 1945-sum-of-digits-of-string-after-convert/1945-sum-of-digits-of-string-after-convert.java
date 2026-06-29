class Solution {
    public int getLucky(String s, int k) {
        
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            sb.append(c-'a'+1);
        }

        int finalSum=0;
        while(k>0){
            int currSum=0;
            for(char c:sb.toString().toCharArray()){
                currSum+= (int) c-'0';
            }
            sb=new StringBuilder(String.valueOf(currSum));
            System.out.println(currSum);
            finalSum=currSum;
            if(currSum<10) break;
            k--;
        }      
        return finalSum;
    }
}