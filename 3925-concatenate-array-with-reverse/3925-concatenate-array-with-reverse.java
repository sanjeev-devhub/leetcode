class Solution {
    public int[] concatWithReverse(int[] nums) {

        int[] res = new int[nums.length*2];
        int len =nums.length;
        for(int i=0;i<len;i++){
            res[i]=nums[i];
            res[i+len]= nums[len-i-1];
        }
        return res;
        
    }
}