class Solution {
    public boolean closeStrings(String w1, String w2) {
        if(w1.length()!=w2.length())
            return false;
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        for(char ch:w1.toCharArray())
            freq1[ch-'a']++;
        for(char ch:w2.toCharArray())
            freq2[ch-'a']++;
        for(int i=0;i<26;i++){
            if((freq1[i]==0) != (freq2[i]==0))
                return false;
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        return Arrays.equals(freq1,freq2);
            

    }
}