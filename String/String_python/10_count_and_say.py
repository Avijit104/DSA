class Solution:
    def countAndSay(self, n: int) -> str:
        def RLE(s):
            res = ""
            cnt = 1
            # print(type(s))
            for i in range(len(s) -1):
                if s[i] == s[i+1]:
                    cnt+=1
                else:
                    res = res + str(cnt) + s[i]
                    cnt = 1
            res = res + str(cnt) + s[len(s)-1]
            # print(res)
            return res
        res = "1"
        while n != 1:
            # print(n)
            res = RLE(res)
            n-=1
        return res