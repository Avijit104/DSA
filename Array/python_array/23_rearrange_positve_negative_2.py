class Solution:
    
    # Optimal Solution
    def rearrangeArray2(self, arr):
        pos = []
        neg =[]
        for i in arr:
            if i  >= 0:
                pos.append(i)
            else:
                neg.append(i)
                
        mini = len(pos)
        if(len(neg) < mini):
            mini = len(neg)
            
        for i in range(mini):
            arr[i*2] = pos[i]
            arr[i*2+1] = neg[i]
       
        index = mini * 2
        if(mini < len(pos)):
            for j in range(mini,len(pos)):
                arr[index] = pos[j]
                index += 1  
        else:
            for j in range(mini, len(neg)):
                arr[index] = neg[j]
                index += 1
       

arr = [1,2,-4,-5,3,6]
s = Solution()
s.rearrangeArray2(arr=arr)
print(arr)