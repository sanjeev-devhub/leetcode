class Solution {
    public int arraySign(int[] nums) {
        int res=1;
        for(int n:nums){
            if(n==0) return 0;
            if(n>0){
                res=res*1;
            }else{
                res=res*-1;
            }
        }
        if(res>0) return 1;
        if(res<0) return -1;
        return 0;
        
    }
}