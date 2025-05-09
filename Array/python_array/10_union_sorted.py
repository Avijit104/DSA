class Solution:
    def unionSortedUsingSet(self, arr1, arr2):
        arr1 = set(arr1)
        arr2 = set(arr2)
        unionArray = arr1.union(arr2)
        return list(unionArray)
    
    # Optimal Solution
    def unionSortedOptiomal(self, arr1, arr2):
        unionArray = []
        i = 0
        j = 0
        while i<len(arr1) and j<len(arr2):
            
            if arr1[i]<= arr2[j]:
                if len(unionArray) == 0:

                    unionArray.append(arr1[i])
                elif unionArray[len(unionArray)-1] != arr1[i]:
                    unionArray.append(arr1[i])
                i+=1
                
            else:
                if len(unionArray) == 0 :
                    unionArray.append(arr2[j])
                elif unionArray[len(unionArray)-1]!= arr2[j]:
                    unionArray.append(arr2[j])
                j+=1
                
        while i < len(arr1):
            if len(unionArray) == 0:

                unionArray.append(arr1[i])
            elif unionArray[len(unionArray)-1] != arr1[i]:
                unionArray.append(arr1[i])
            i+=1
            
        while j < len(arr2):
            if len(unionArray) == 0 :
                unionArray.append(arr2[j])
            elif unionArray[len(unionArray)-1]!= arr2[j]:
                unionArray.append(arr2[j])
            j+=1
        return unionArray
            
        
arr1 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
arr2 = [2, 3, 4, 4, 5, 11, 12]
s = Solution()
print(s.unionSortedUsingSet(arr1, arr2))
print("optimal solution")
print(s.unionSortedOptiomal(arr1, arr2))
