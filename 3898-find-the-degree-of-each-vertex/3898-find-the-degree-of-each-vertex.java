class Solution {
    public int[] findDegrees(int[][] matrix) {
        int row=matrix.length;
        int res[]=new int[row];
        for(int i=0;i<row;i++){
            int count=0;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==1)
                    count++;
            }
            res[i]=count;
        }
        return res;
    }
}