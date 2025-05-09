class Solution:
    def longestSubArraySum(self, arr, k):
        length = 0
        for i in range(len(arr)):
            sumArr = 0
            for j in range(i,len(arr)):
                sumArr = sumArr + arr[j]
                if sumArr == k:
                    if (j-i+1) > length:
                        length = (j-i+1)
                        break
                elif sumArr > k:
                    break
        return length
    
    # Optimal Solution
    def longestSubArraySumOptimal(self, arr, k):
        right = 0
        left = 0
        sumArr = arr[right]
        length = 0
        while(right<len(arr)):
            right += 1
            if right< len(arr):
                sumArr = sumArr + arr[right]    
            while sumArr > k and right > left:                
                sumArr = sumArr - arr[left]
                left+=1
            if sumArr == k:
                if right-left+1 > length:
                    length = right-left+1
        return length
                


s = Solution()
arr = [1,2,3,1,1,1,1,4,2,3]
k = 3
print("result is ",s.longestSubArraySumOptimal(arr, k))