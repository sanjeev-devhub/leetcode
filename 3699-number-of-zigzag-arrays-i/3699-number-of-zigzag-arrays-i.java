class Solution {
    public int zigZagArrays(int n, int l, int r) {
        final int MOD = 1_000_000_007;

        int m = r - l + 1;

        long[] dp = new long[m];
        java.util.Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            long pref = 0;

            if ((i & 1) == 1) {
                for (int v = 0; v < m; v++) {
                    long nextPref = (pref + dp[v]) % MOD;
                    dp[v] = pref;
                    pref = nextPref;
                }
            } else {
                for (int v = m - 1; v >= 0; v--) {
                    long nextPref = (pref + dp[v]) % MOD;
                    dp[v] = pref;
                    pref = nextPref;
                }
            }
        }

        long ans = 0;
        for (long x : dp) {
            ans = (ans + x) % MOD;
        }

        return (int) ((ans * 2) % MOD);
    }
}