class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==1)  return true;
        boolean b=false;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]%2==nums[i]%2){
                return false;
            }
            else
                b=true;
        }
        return b;
    }
}