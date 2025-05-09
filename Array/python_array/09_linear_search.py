class Solution:
    def linearSearch(self, arr, num):
        for i in range(0, len(arr)):
            if arr[i] == num:
                return i
            
        return -1
    


s = Solution()
arr = [6,7,8,4,1, 10]
num = 11
print(s.linearSearch(arr, num))