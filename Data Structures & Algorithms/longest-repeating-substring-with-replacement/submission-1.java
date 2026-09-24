class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> frequency = new HashMap<>();
        int left = 0;
        int result = 0;
        int maxCount = 0;

        for(int right = 0; right < s.length();right++){
            char c = s.charAt(right);
            frequency.put(c,frequency.getOrDefault(c,0) + 1);

            maxCount = Math.max(maxCount, frequency.get(c));

            if((right - left + 1) - maxCount > k){
                char leftChar = s.charAt(left);
                frequency.put(leftChar, frequency.get(leftChar) - 1);
                left++;
            } 

            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}
