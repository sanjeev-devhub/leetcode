class Solution {
    public int findLucky(int[] arr) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==map.get(arr[i])){
                return arr[i];            }
        }
        return -1;
        
    }
}