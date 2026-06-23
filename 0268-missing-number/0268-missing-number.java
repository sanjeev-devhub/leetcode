class Solution {
    public int missingNumber(int[] nums) {
        int len =nums.length;
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        for(int i=1;i<=len;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return 0;       
        
    }
}