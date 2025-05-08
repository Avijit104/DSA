class Solution:
    
    def secondLargestTwoPass(self, nums):
        largest, sLargest = -1, -1
        
        # first pass find the largest 
        for i in nums:
            if i > largest:
                largest = i
        # second pass find the second largest 
        for j in nums:
            if j > sLargest and j != largest:
                sLargest =  j
                
        return sLargest
    
    # optimal solution
    def secondLargestOptimal(self, nums):
        largest, sLargest = -1, -1
        for i in nums:
            if i > largest:  
                sLargest = largest
                largest = i
            if i > sLargest and i < largest:
                sLargest = i
                
        return sLargest

arr = [1 ,2,4,7,7,5]
s = Solution()
print(s.secondLargestTwoPass(arr))
print(s.secondLargestOptimal(arr))