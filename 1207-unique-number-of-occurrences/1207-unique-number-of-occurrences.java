class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        HashSet<Integer>hs=new HashSet<>();
        int len=0;
        for(int n:arr)
            hm.put(n,hm.getOrDefault(n,0)+1);
        for(Integer n:hm.keySet()){
            len++;
            hs.add(hm.get(n));
        }
        return len==hs.size();
    }
}