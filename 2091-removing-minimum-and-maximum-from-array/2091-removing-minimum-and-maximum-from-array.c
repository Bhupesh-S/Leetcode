int minimumDeletions(int* nums, int n) {
    int min=nums[0],max=nums[0];
    int minIdx=0,maxIdx=0;
    for(int i=0;i<n;i++){
        if(nums[i]<min){
            min=nums[i];
            minIdx=i;
        }
        if(nums[i]>max){
            max=nums[i];
            maxIdx=i;
        }
    }
    if(minIdx>maxIdx){
        int temp=minIdx;
        minIdx=maxIdx;
        maxIdx=temp;
    }
    int left=maxIdx+1;
    int right=n-minIdx;
    int both=(minIdx+1)+(n-maxIdx);
    int ans=left;
    if(right<ans)   ans=right;
    if(both<ans)    ans=both;
    return ans;
}