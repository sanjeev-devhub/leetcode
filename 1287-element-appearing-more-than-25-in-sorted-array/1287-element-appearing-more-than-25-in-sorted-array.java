class Solution {
    public int findSpecialInteger(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n: arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int per=arr.length/4;
        for(int n:arr){
            if(map.get(n)>per){
                return n;
            }
        }
        return -1;        
    }
}