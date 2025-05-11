class Solution:
    def sortCoutnt(self, arr):
        cnt0, cnt1, cnt2 = 0,0,0
        for i in arr:
            if i == 0:
                cnt0 +=1
            elif i == 1:
                cnt1+=1
            else:
                cnt2+=1
        for i in range(0,cnt0):
            arr[i] = 0
        for i in range(cnt0,cnt1+cnt0):
            arr[i] = 1
        for i in range(cnt1+cnt0,len(arr)):
            arr[i] = 2
        return arr

    # Optimal solution
    def stortDuchOptimal(self, arr):
        low  = 0
        mid = 0
        high = len(arr) -1
        while(mid<=high):
            if arr[mid] == 0:
                temp = arr[mid]
                arr[mid] = arr[low]
                arr[low] = temp
                low+=1
                mid+=1
            elif arr[mid] == 1:
                mid+=1
            else:
                temp = arr[mid]
                arr[mid] = arr[high]
                arr[high] = temp
                high-=1
        return arr


s = Solution()  
arr = [0,1,2,0,1,2,1,2,0,0,0,1]
# print(s.sortCoutnt(arr=arr))
print(s.stortDuch(arr))