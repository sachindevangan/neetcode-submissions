class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        left = 0
        freq = {}
        max_freq = 0
        result = 0

        for right in range(len(s)):
            #right char add
            freq[s[right]] = freq.get(s[right], 0) + 1

            #max freq update karo
            max_freq = max(max_freq, freq[s[right]])
            
            #is window valid ?
            window_size = right - left + 1
            replacements_needed = window_size - max_freq

            if replacements_needed > k:
                #invalid
                freq[s[left]] -= 1
                if freq[s[left]] == 0:
                    del freq[s[left]]
                left += 1

            result = max(result, right - left + 1)

        return result