class Solution {
    public int missingNumber(int[] nums) {
        int len =nums.length;

        int nSum=len*(len+1)/2;
        int actualSum=0;
        for(int n:nums){
            actualSum+=n;
        }
        return Math.abs(nSum-actualSum);   
        
    }
}