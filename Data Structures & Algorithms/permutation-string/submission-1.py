class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2):
            return False

        freq_s1 = {}

        for char in s1:
            freq_s1[char] = freq_s1.get(char, 0) + 1

        #pehla window banao
        freq_window = {}
        for i in range(len(s1)):
            freq_window[s2[i]] = freq_window.get(s2[i], 0) + 1

        if freq_window == freq_s1:
            return True

        #Window slide karo
        for right in range(len(s1), len(s2)):
            #naya element add karo
            freq_window[s2[right]] = freq_window.get(s2[right], 0) + 1

            #purana left element hatao
            left = right - len(s1)
            freq_window[s2[left]] -= 1
            if freq_window[s2[left]] == 0:
                del freq_window[s2[left]]
            
            #check karo
            if freq_window == freq_s1:
                return True
        
        return False