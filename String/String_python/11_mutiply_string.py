class Solution:
    def multiply(self, num1: str, num2: str) -> str:
        if num1 == "0" or num2 == "0":
            return "0"
        shift = 1
        ans = 0
        for i in range(len(num1)-1, -1, -1):
            temp = 0
            innerShift = 1
            for j in range(len(num2)-1, -1, -1):
                temp = temp +( innerShift * (int(num1[i]) * int(num2[j])))
                innerShift *=  10
            print(len(num1), len(num2))
            ans = ans + (temp * shift)
            shift *= 10
        return str(ans)
    
    