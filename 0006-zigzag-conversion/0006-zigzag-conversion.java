class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            sb[i]=new StringBuilder();
        }
        int len = s.length();
        int index=0;
        char[] chars = s.toCharArray();
        while(index<len){
            for(int j=0;j<numRows && index<len;j++){
                sb[j].append(chars[index++]);
            }
             for(int j=numRows-2;j>0 && index<len;j--){
                sb[j].append(chars[index++]);
            }
        }
        StringBuilder res= new StringBuilder(sb[0]);
        for(int i=1;i<numRows;i++){
            res.append(sb[i]);
        }
        return res.toString();

    }
}