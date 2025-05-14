class Solution:
    def rearrangeArray(self, arr):
        pos = []
        neg = []
        for i in arr:
            if i< 0:
                neg.append(i)
            else:
                pos.append(i)
            
        for i in range(int(len(arr)/2)):
            arr[2*i] = pos[i]
            arr[2*i+1] = neg[i]
        
    # Optimal Solution
    def rearrangeArrayOptimal(self, arr):
        pos = 0
        neg = 1
        ans = [0]*len(arr)
        for i in arr:
            if i<0:
                ans[neg] = i
                neg += 2
            else:
                ans[pos] = i
                pos += 2
        return ans

s = Solution()
arr = [3,1,-2,-5,2,-4]
s.rearrangeArray(arr=arr)
print(arr)
print("Optimal Solution")
print(s.rearangeArrayOptimal(arr))