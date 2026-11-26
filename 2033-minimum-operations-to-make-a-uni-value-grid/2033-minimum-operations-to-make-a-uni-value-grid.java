class Solution {
    public int minOperations(int[][] grid, int x) {
        int row=grid.length;
        int col=grid[0].length;
        int arr[]=new int[row*col];
        int k=0;
        int rem=grid[0][0]%x;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]%x!=rem)
                    return -1;
                arr[k++]=grid[i][j];
            }
        }
        Arrays.sort(arr);
        int mid=arr[arr.length/2];
        int op=0;
        for(int a:arr){
            op+=Math.abs(a-mid)/x;
        }
        return op;
    }
}