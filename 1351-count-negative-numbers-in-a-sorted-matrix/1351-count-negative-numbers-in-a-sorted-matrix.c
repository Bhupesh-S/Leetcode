int countNegatives(int** grid, int row, int* col) {
    int count=0;
    for(int i=0;i<row;i++){
        for(int j=0;j<*col;j++){
            if(grid[i][j]<0)
                count++;
        }
    }
    return count;
}