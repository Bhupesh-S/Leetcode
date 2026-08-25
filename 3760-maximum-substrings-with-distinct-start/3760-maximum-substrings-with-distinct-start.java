class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> hs=new HashSet<>();
        char ch[]=s.toCharArray();
        for(char c:ch)
            hs.add(c);
        return hs.size();        
    }
}