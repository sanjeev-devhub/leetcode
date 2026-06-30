class Solution {
    public int[] decimalRepresentation(int n) {
        String s=String.valueOf(n);
        List<Integer> res= new ArrayList<>();
        int i=0;
        while(n>0){
            int temp= n%10;
            int pow=(int) Math.pow(10,i++);
             n/=10;
            if(temp*pow==0)continue;
            res.add(0,temp*pow);           
        }
        int[] result= new int[res.size()];
        i=0;
        for(Integer number:res){
            result[i++]=number;
        }
        
        return result;
        
    }
}