class Solution:
    
    def isValid(self, s: str) -> bool:
        if len(s) == 1:
            return False
        arr = []
        index = -1
        for i in s:
            if i == "(":
                index+=1
                arr.append(")")
            elif i == "{":
                index+=1
                arr.append("}")
            elif i == "[":
                index+=1
                arr.append("]")
                
            else:
                if index == -1:
                    return False
                elif i != arr[index]:
                    return False
                else:
                    arr.pop(index)
                    index -= 1

        if len(arr) == 0:
            return True
        else:
            return False
        