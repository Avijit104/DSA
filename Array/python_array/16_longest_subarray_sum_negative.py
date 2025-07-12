class Solution:
    
    # Optimal Solution
    def longestSubArraySumNegative(self, arr, k):
        hashMap = {}
        sumArr = 0
        length = 0
        for i in range(len(arr)):
            print(length, sumArr, i)
            sumArr = sumArr + arr[i]
            if sumArr > k:
                key = sumArr - k
                if key in hashMap:
                    length = max((i-hashMap[key]), length)
            if sumArr == k:
                length = max(length, (i+1))
            if sumArr not in hashMap:
                hashMap[sumArr] = i
                
        print(hashMap)
        return length
                



s = Solution()
arr = [1,2,3,1,1,-1,1,1,4,2,3]
k = 3
print(s.longestSubArraySumNegative(arr, k))