class Solution {
    public int countPrimeSetBits(int left, int right) {
        int countPrimes=0;
        
        while(left<=right){
            if(isPrime(Integer.bitCount(left))){
                countPrimes++;
            }
            left++;

        }
        return countPrimes;
    }
    private boolean isPrime(int n){
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}