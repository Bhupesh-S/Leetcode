class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int total=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int n:nums){
            int count=0;
            int t=n;
            while(t!=0){
                int rem=t%10;
                if(rem==digit)
                    hm.put(n,hm.getOrDefault(n,0)+1);
                t/=10;
            }
        }
        for(int key:hm.keySet()){
            total+=hm.get(key);
        }
        return total;
    }
}