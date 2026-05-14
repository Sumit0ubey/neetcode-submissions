class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        pre, pos, size = 1, 1, len(nums)
        result = [0] * size

        for i in range(size):
            result[i] = pre
            pre *= nums[i]
        
        for i in range(size - 1, -1, -1):
            result[i] *= pos
            pos *= nums[i]
        
        return result
