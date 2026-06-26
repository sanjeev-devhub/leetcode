class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum=0;
        int digitSum=0;

        for(int n:nums){
            eleSum+=n;
            int temp=n;
            int currSum=0;
            while(temp>0){
                currSum+=temp%10;
                temp/=10;
            }
            digitSum+=currSum;
        }
        return Math.abs(eleSum-digitSum);
        
    }
}