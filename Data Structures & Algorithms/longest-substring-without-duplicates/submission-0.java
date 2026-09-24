class Solution {
    public int lengthOfLongestSubstring(String s) {

       HashSet<Character> charSet = new HashSet<>();

       int n = s.length();
       int maxLength = 0;
       int right = 0;

        for (int left = 0; left < n; left++) {
            while (right < n && !charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            }
            charSet.remove(s.charAt(left));
        }
        return maxLength;
    }
}
