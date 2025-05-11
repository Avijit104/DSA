class Solution:
    def twoSum(self, arr, target):
        res = []
        for i in range(len(arr)):
            temp = []   
            diff = target - arr[i]
            print(diff)
            if diff in arr[i:len(arr)]:
                temp.append(i)
                temp.append(arr.index(diff))
                res.append(temp)
        return(res)

    def twoSumHashmap(self, arr, target):
        hashMap = {}
        res = []
        for i in range(len(arr)):
            temp = []
            diff = target - arr[i]
            if diff in hashMap.keys():
                temp.append(hashMap[diff])
                temp.append(i)
                res.append(temp)
            else:
                hashMap[arr[i]] = i
        return res
        
        
s = Solution()
arr = [2,6,5,8,9]
target = 14
print(s.twoSum(arr, target))
print(s.twoSumHashmap(arr, target))