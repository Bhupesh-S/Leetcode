class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<k;i++)
            sum+=nums[i];
        int max=sum;
        for(int i=0;i<n-k;i++){
            sum-=nums[i];
            sum+=nums[k+i];
            if(sum>max)
                max=sum;
        }
        return (double)max/k;
    }
}