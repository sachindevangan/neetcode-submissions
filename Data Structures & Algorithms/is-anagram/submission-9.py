class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        sCount = {}
        tCount = {}

        for ch in s:
            sCount[ch] = sCount.get(ch, 0) + 1
        
        for c in t:
            tCount[c] = tCount.get(c, 0) + 1

        return sCount == tCount