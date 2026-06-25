class Solution {
    public int[] transformArray(int[] nums) {
        int[] res = new int[nums.length];
        int left=0;
        int right=nums.length-1;
        for(int n:nums){
            if(n%2==0){
                res[left++]=0;
            }else{
                res[right--]=1;
            }
        }
        return res;
        
    }
}