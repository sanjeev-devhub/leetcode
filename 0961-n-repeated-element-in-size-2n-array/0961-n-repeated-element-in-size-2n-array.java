class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int n:nums){
            if(map.get(n)>=2){
                return n;
            }
        }
        return 0;
    }
}