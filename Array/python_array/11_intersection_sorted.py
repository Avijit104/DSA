class Solution:
    def intersectionSrotedVisited(self, arr1, arr2):
        interArr = []
        visited = [0] * len(arr2)
        for i in range(len(arr1)):
            for j in range(len(arr2)):
                if arr1[i] ==  arr2[j] and visited[j] != 1:
                    interArr.append(arr1[i])
                    visited[j] = 1
                    break
                if arr1[i] < arr2[j] :
                    break
                    
        return interArr
    
    # Optimal Solution
    def intersectionSortedOptimal(self, arr1, arr2):
        j = 0
        i = 0
        interArr = []
        while(i<len(arr1) and j<len(arr2)):
            if arr1[i] < arr2[j]:
                i += 1
            elif arr1[i] > arr2[j]:
                j += 1
            else:
                interArr.append(arr1[i])
                i += 1
                j += 1
        return interArr
            
            
            
arr2 = [1,2,2,3,3,4,5,6]
arr1 = [2,3,3,5,6,6,7]
s = Solution()
print(s.intersectionSrotedVisited(arr1, arr2))

print("optimal solution")
print(s.intersectionSortedOptimal(arr1, arr2))