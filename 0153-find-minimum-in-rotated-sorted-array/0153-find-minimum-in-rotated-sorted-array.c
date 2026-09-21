int findMin(int* nums, int n) {
    int min=INT_MAX;
    for(int i=0;i<n;i++){
        min=fmin(min,nums[i]);
    }
    return min;
}