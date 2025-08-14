class Solution:
    def intToRoman(self, num: int) -> str:
        res = ""
        if num >= 1000:
            div = num // 1000
            res = res + div* "M"
            num = num % 1000
        if num >= 900:
            res = res + "CM"
            num = num - 900
        if num >= 500:
            res = res +  "D"
            num = num - 500
        if num >= 400:
            res = res + "CD"
            num = num - 400
        if num >= 100:
            div = num // 100
            res = res + div*"C"
            num = num % 100
        if num >= 90:
            res = res + "XC"
            num = num - 90
        if num >= 50:
            res = res + "L"
            num = num - 50
        if num >= 40:
            res = res + "XL"
            num = num -40
        if num >= 10: 
            div = num // 10
            res = res + div*"X"
            num = num % 10
        if num == 9:
            res = res + "IX"
            num = num - 9
        if num >= 5 :
            res = res + "V"
            num = num - 5
        if num == 4:
            res = res + "IV"
            num = num - 4
        if num >= 1:
            div = num // 1
            res = res + div * "I"


        return res
s = Solution()
num = 1999 #output MCMXCIX
res = s.intToRoman(num)
print(res)