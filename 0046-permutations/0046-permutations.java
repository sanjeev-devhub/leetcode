class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer= new ArrayList<>();
        List<Integer> output= new ArrayList<>();
        boolean[] freq= new boolean[nums.length];
        allPermutation(nums,output,freq,answer);
        return answer;        
    }
    private void allPermutation(int[] arr, List<Integer> output, boolean[] freq, List<List<Integer>> answer){
        if(output.size()==arr.length){
            answer.add(new ArrayList<>(output));
            return ;
        }
        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                freq[i]=true;
                output.add(arr[i]);
                allPermutation(arr,output,freq,answer);
                output.remove(output.size()-1);
                freq[i]=false;
            }
        }
    }
}