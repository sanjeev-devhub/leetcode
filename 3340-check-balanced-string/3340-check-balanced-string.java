class Solution {
    public boolean isBalanced(String num) {

        char[] chars = num.toCharArray();
        int evenSum=0;
        int oddSum=0;
        for(int i=0;i<chars.length;i++){
            int n=(int) chars[i]-48;
            if(i%2==0){
                evenSum+=n;
            }else{
                oddSum+=n;
            }
        }
        return evenSum==oddSum;
        
    }
}