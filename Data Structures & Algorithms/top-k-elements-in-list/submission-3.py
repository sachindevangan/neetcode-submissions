class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        if k <= 0:
            return None
        
        counter = {}

        for num in nums:
            counter[num] = counter.get(num, 0) + 1

        sorted_nums = sorted(counter.keys(), key = lambda x: counter[x], reverse = True)

        return sorted_nums[:k]