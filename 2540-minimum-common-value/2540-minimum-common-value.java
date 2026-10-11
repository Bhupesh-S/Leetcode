class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer>hs=new HashSet<>();
        for(int n:nums2)
            hs.add(n);
        for(int n:nums1)
            if(hs.contains(n))
                return n;
        return -1;
    }
}