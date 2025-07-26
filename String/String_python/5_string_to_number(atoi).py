class Solution:
    def myAtoi(self, s: str) -> int:
        s = s.strip()
        strt = ""
        neg = False
        for i in s:

            if i.isdigit():
                strt = strt + i
            elif i == '-' and strt == "":
                strt = strt + '0'
                neg = True
            elif i == '+' and strt == "":
                strt = strt + '0'
                continue
            else:
                break

        if strt == "":
            return 0
        else:
            if neg == True:
                res = int(strt) * (-1)
                if res < -(2**31):
                    return -(2**31)
                else:
                    return res
            else:
                res = int(strt)
                if res > 2**31 -1:
                    return 2**31 -1
                else:
                    return res
                
s= Solution()
st = "-123d23"
res = s.myAtoi(st)
print(res)