from typing import List


class Solution:
    def longestCommonPrefix(self, arr: List[str]) -> str:
        minLength = arr[0]
        for i in arr:
            if len(i) < len(minLength):
                minLength = i
        res = ""
        for i in range(len(minLength)):
            flag = True
            for j in arr:
                if minLength[i] != j[i]:
                    flag = False
                    break
            if flag == True:
                res += minLength[i]
            else:
                break
        return res

s = Solution()
strs = ["flower","flow","flight"]
s.longestCommonPrefix(strs)