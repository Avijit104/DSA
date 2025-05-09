class Solution:
    def appearOnceHashmap(self, arr):
        hashMap = {}
        for i in arr:
            if i in hashMap:
                hashMap[i]+=1 
            else:
                hashMap[i] = 1
        for i in hashMap.keys():
            if hashMap[i] == 1:
                return i
        return 0
    
    # Optimal Solution
    def appearsOnce(self, arr):
        xor1 = 0
        for i in arr:
            xor1 = xor1 ^ i
        return xor1
    
        
        
s = Solution()
arr = [1,1,10,3,3,4,4,5,5]
print(s.appearsOnce(arr))
print(s.appearOnceHashmap(arr))