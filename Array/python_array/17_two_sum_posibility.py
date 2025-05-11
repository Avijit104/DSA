class Solution:
    def twoSumPosibility(self, arr, target):
        for i in arr:
            diff = target - i
            if diff in arr:
                return True
        return False

    # Optimal Solution
    def twoSumPosibilityOptimal(self, arr, target):
        left = 0
        right = len(arr) -1
        sumArr = 0
        while(left<right):
            sumArr = arr[left] + arr[right]
            if sumArr > target:
                right-=1
            elif sumArr < target:
                left+=1
            else:
                return True
        return False

s = Solution()
arr = [2,6,5,8,11]
target = 14
print(s.twoSumPosibility(arr, target))
print(s.twoSumPosibilityOptimal(arr, target))