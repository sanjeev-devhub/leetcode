class Solution {
    public int minimumFlips(int n) {
        String str=Integer.toBinaryString(n);
        int flips=0;
        int len=str.length();
        for(int i=0;i<len/2;i++){
            if(str.charAt(len-i-1)!=str.charAt(i)){
                flips+=2;
            }
        }

        return flips;
    }
}