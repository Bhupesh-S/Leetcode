class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int maxCount = 0;
        HashSet<Character> hs = new HashSet();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        for (int i = 0; i < k; i++) {
            if (hs.contains(s.charAt(i))) {
                count++;
            }
        }
        maxCount=count;

        for(int i=k;i<s.length();i++){
            if(hs.contains(s.charAt(i)))
                count++;
            
            if(hs.contains(s.charAt(i-k)))
                count--;
            
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }
}