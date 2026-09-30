class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int diff[][]=new int[row][col];
        int[] onesRow=new int[row];
        int[] onesCol=new int[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    onesRow[i]++;
                    onesCol[j]++;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int zerosRow=row-onesRow[i];
                int zerosCol=col-onesCol[j];
                diff[i][j]=onesRow[i]+onesCol[j]-zerosRow-zerosCol;
            }
        }
        return diff;
    }
}