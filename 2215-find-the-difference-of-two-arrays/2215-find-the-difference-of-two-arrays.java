class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ls = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for (int n : nums1)
            hs1.add(n);
        for (int n : nums2)
            hs2.add(n);
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if (nums1.length > 0 && !hs2.contains(nums1[0]))
            l1.add(nums1[0]);
        for (int i = 1; i < nums1.length; i++) {
            if (nums1[i - 1] != nums1[i] && !hs2.contains(nums1[i]))
                l1.add(nums1[i]);
        }
        if (nums2.length > 0 && !hs1.contains(nums2[0]))
            l2.add(nums2[0]);
        for (int i = 1; i < nums2.length; i++) {
            if (nums2[i - 1] != nums2[i] && !hs1.contains(nums2[i]))
                l2.add(nums2[i]);
        }
        ls.add(l1);
        ls.add(l2);
        return ls;
    }
}