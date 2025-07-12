class Solution:
    
    #optimal
    def leaders(self, arr):
        max = 0
        res = []
        for i in range(len(arr)-1, -1, -1):
            if arr[i] > max:
                max = arr[i]
                res.append(max)
                
        return res

s = Solution()
arr = [10,22,12,3,0,6]
res = s.leaders(arr)
print(res)