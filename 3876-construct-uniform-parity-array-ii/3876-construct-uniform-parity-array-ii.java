class Solution {
    public boolean uniformArray(int[] nums1) {
        int oddParity=0;
        int evenParity=0;
        int len=nums1.length;
        int minOdd=Integer.MAX_VALUE;
        for(int n:nums1){
            if(n%2==0)  evenParity++;
            else {
                oddParity++;
                minOdd=Math.min(minOdd,n);
            }
        }
        if(oddParity==len || evenParity==len)  return true;
        for(int n:nums1){
            if(n%2==0 && n<minOdd)
                return false;
        }
        return true;
    }
}