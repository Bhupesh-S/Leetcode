class Solution {
    public int findMin(int[] nums) {
        int ans=nums[0];
        HashSet<Integer>hs=new HashSet<>();
        for(int n:nums)
            hs.add(n);
        for(int n:hs){
            ans=Math.min(ans,n);
        }
        return ans;
    }
}