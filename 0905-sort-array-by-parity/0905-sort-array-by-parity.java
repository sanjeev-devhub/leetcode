class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int even=0;
        int odd=nums.length-1;
        for(int n:nums){
            if(n%2==0){
                res[even++]=n;
            }else{
                res[odd--]=n;
            }
        }
        return res;        
    }
}