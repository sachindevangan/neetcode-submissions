class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        left = 0
        right = 0
        freq = {}
        result = 0

        while right < len(s):
            #right element ko add karo
            freq[s[right]] = freq.get(s[right], 0) + 1

            #window invalid hai - matlab duplicate
            while freq[s[right]] > 1:
                freq[s[left]] -= 1
                if freq[s[left]] == 0:
                    del freq[s[left]]
                left += 1
            
            result = max(result, right - left + 1)
            right += 1
        
        return result

