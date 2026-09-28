class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        int row=accounts.length;
        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}