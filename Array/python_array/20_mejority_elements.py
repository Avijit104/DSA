class Solution:
    def mejorityElemtntHashmap(self, arr):
        hashMap = {}
        for i in arr:
            if i in hashMap:
                hashMap[i] += 1
                if hashMap[i] > len(arr)/2:
                    return i
            else:
                hashMap[i] = 1
        return -1

    # Optimal Solution using moore's voting algorithm
    def majorityElementOptimal(self, arr):
        el = arr[0]
        cnt = 0 
        for i in range(len(arr)):
            if el == arr[i]:
                cnt += 1
            else:
                cnt -= 1
            if cnt ==  0:
                el = arr[i+1]
        cnt2 = 0
        for i in arr:
            if i == el:
                cnt2 += 1
        if cnt2 > len(arr)/2:
            return el
        else:
            return -1
        

s = Solution()
arr = [2,4,4,4,1,4,2]
print(s.mejorityElemtntHashmap(arr))
print("Optimal Solution")
print(s.majorityElementOptimal(arr))