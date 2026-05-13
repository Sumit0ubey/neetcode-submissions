class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        counts = {}

        for i, num in enumerate(nums):
            comp = target - num
            if comp in counts:
                return [counts[comp], i]
            counts[num] = i
        return []

        