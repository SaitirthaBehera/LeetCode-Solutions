class Solution(object):
    def containsDuplicate(self, nums):
        ans=len(nums)!=len(set(nums))
        return ans
        """
        :type nums: List[int]
        :rtype: bool
        """
        