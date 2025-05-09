class Solution:
    
    # Optimal Solution
    def consecutiveOnes(self, arr):
        maxCnt = 0
        cnt = 0
        for i in arr:
            if i==1:
                cnt += 1
            else:
                if cnt > maxCnt:
                    maxCnt = cnt
                cnt = 0
        if cnt > maxCnt:
            maxCnt = cnt
        return maxCnt
    
arr = [1,1,0,1,1,1,0,1,1]
s = Solution()
print(s.consecutiveOnes(arr))
                