class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int zeroes=0;
        int maxCount=0;
        int left=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0)
                zeroes++;
            while(zeroes>k){
                if(nums[left]==0)
                    zeroes--;
                left++;
            }
            maxCount=Math.max(maxCount,i-left+1); 
        }
        return maxCount;
    }
}