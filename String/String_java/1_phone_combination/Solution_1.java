import java.util.ArrayList;
import java.util.HashMap;

public class Solution_1 {
    ArrayList<String> res = new ArrayList<>();
    static HashMap<String, String> map = new HashMap<>();

    void backtrack(int idx, String str, String digits) {
        if (idx == digits.length()) {
            res.add(str);
            return;
        } else {
            String val = map.get(digits.charAt(idx));
            for (int i = 0; i < val.length(); i++) {
                backtrack(idx + 1, str + val.charAt(i), digits);
            }

        }
    }

    public void combinationPhone(String str) {
        if (str.length() == 0 || str == null) {
            return;
        }
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
        backtrack(0, "", str);
    }

    public static void main(String[] args) {
        String str = "23";
        Solution_1 s = new Solution_1();
        s.combinationPhone(str);
        for (String i : s.res) {
            System.out.print(i + ", ");
        }
    }

}
