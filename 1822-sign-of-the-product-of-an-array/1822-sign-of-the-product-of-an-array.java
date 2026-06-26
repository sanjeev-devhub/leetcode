class Solution {
    public int arraySign(int[] nums) {
        double res=1;
        for(int n:nums){
            res= res*n;
        }
        if(res>0) return 1;
        if(res<0) return -1;
        return 0;
        
    }
}