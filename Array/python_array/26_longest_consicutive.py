class Solution:
    def longestConsicutive(self, array):
        array.sort()
        cnt = 1
        lastSmall = -1
        length = 0
        for i in array:
            if i-1 ==lastSmall:
                cnt +=1
                lastSmall = i
            elif i != lastSmall:
                cnt = 1
                lastSmall = i

            length = max(cnt, length)
        return length
        



s = Solution()
arr = [9,4,3,100,1,102,100,2,5,103]
res = s.longestConsicutive(arr)
print(res)
print(arr)
