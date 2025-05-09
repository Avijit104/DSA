class Solution:
    def missingNumberLinear(self, arr, n):
        for i in range(1,n):
            if i not in arr:
                return i
        return -1
    
    def missingNumberHash(self, arr, n):
        hashArr = [0] * (n+1)
        for i in arr:
            hashArr[i] = 1
        for i in range(1, n):
            if hashArr[i] == 0:
                return i
        return -1
    
    # Optimal solution
    def missingNumberSum(self, arr, n):
        sumOri = int(n*(n+1)/2)
        sumArr = 0
        for i in arr:
            sumArr += i
        return (sumOri - sumArr)
    
    # Optimal solution slightly better in space than sum method
    def missingNumberXOR(self, arr, n):
        xor1 = 0
        xor2 = 0
        for i in range(len(arr)):
            xor1 = xor1 ^ arr[i]
            xor2 = xor2 ^ (i+1)
        xor2 = xor2 ^ n
        return (xor1 ^ xor2)
    
    
arr = [1,2,4,5]
n = 5
s = Solution();
print(s.missingNumberLinear(arr, n))
print(s.missingNumberHash(arr, n))
print(s.missingNumberSum(arr, n))
print(s.missingNumberXOR(arr, n))