class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        merged = nums1 + nums2

        merged.sort()

        total = len(merged)
        mid = total // 2

        if total % 2 == 1:
            return float(merged[mid])
        
        else:
            return (merged[mid - 1] + merged[mid]) / 2.0