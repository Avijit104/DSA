from typing import List


class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        def solve(o,c,ans):
            if len(ans)==2*n:
                r.append(ans)
                return
            if o<n:
                solve(o+1,c,ans+"(")
            if c<o:
                solve(o,c+1,ans+")")
        r=[]
        solve(0,0,"")
        return r