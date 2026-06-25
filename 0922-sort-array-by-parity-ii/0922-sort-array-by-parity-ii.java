class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];
        int odd=1;
        int even=0;
        for(int n:nums){
            if(n%2==0){
                res[even]=n;
                even+=2;
            }else{
                res[odd]=n;
                odd+=2;
            }
        }
        return res;

        
    }
}