class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;
        for(int n:nums) total+=n;
        int cur=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            cur=Math.max(cur+nums[i],nums[i]);
            max=Math.max(max,cur);
        }
        cur=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            cur=Math.min(cur+nums[i],nums[i]);
            min=Math.min(min,cur);
        }
        if(max<0)
            return max;
        return Math.max(max,total-min);
    }
}