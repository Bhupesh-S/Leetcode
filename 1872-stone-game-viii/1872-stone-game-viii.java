class Solution {
    public int stoneGameVIII(int[] stones) {
        int n=stones.length;
        int prefix[]=new int[n];
        prefix[0]=stones[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+stones[i];
        }
        int dp=prefix[n-1];
        for(int j=n-2;j>=1;j--){
            dp=Math.max(dp,prefix[j]-dp);
        }
        return dp;
    }
}