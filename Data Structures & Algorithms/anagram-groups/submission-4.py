class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        counter = {}

        for word in strs:
            key = "".join(sorted(word))

            if key not in counter:
                counter[key] = []

            counter[key].append(word)
        return list(counter.values()) 