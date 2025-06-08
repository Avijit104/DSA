class Solution:
    def nextPermutation(self, arr):
        pivot = -1
        for i in range(len(arr) -1, 0, -1):
            if(arr[i] > arr[i-1]):
                pivot = i-1
                break
        if(pivot == -1):
            arr.reverse()
            return
        for i in range(len(arr) -1, pivot, -1):
            if(arr[i] >  arr[pivot]):
                arr[i], arr[pivot] = arr[pivot], arr[i]
                break
        left = pivot+1
        right = len(arr)-1
        while left<right :
            arr[left], arr[right] = arr[right], arr[left]
            left += 1
            right -= 1
            
        # print(arr)
        

arr = [4,3,2,1]
s = Solution() 
s.nextPermutation(arr)
print(arr)