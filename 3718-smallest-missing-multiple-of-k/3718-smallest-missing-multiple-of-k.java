class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>hs=new HashSet<>();
        for(int n:nums)
            hs.add(n);
        int a=k;
        while(hs.contains(a))
            a+=k;
        return a;        
    }
}