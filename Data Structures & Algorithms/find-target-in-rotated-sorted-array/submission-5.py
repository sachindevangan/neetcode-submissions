class Solution:
    def search(self, nums: List[int], target: int) -> int:
        left = 0
        right = len(nums) - 1

        while left <= right:
            mid = (left + right) // 2

            if nums[mid] == target:
                return mid
            
            #check if left sorted hai?
            if nums[left] <= nums[mid]:

                #kya target left sorted ki range mein hai ?
                if nums[left] <= target < nums[mid]:
                    right = mid - 1
                
                else:
                    left = mid + 1
            
            else: 
                # right sorted hai
                if nums[mid] < target <= nums[right]:
                    #kya target right sorted ki range mein hai?
                    left = mid + 1

                else:
                    right = mid - 1
        return - 1
