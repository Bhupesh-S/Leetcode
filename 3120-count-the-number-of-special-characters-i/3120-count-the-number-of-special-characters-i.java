class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> hs = new HashSet<>();
        HashSet<Character> hs1 = new HashSet<>();
        int count = 0;
        for (char ch : word.toCharArray()) {
            if (Character.isLowerCase(ch))
                hs.add(ch);
        }
        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch))
                hs1.add(ch);
        }
        for (char ch : hs1) {
            if (hs.contains(Character.toLowerCase(ch)))
                count++;
        }
        return count;
    }
}