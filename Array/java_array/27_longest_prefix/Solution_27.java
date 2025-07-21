
class Solution_27 {
    public String longestPrefix(String arr[]) {
        String minlen = arr[0];
        for (String i : arr) {
            if (i.length() < minlen.length()) {
                minlen = i;
            }
        }
        String res = "";
        for (int i = 0; i < minlen.length(); i++) {
            Boolean flag = true;
            for (String j : arr) {
                if (minlen.charAt(i) != j.charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                res = res + minlen.charAt(i);
            } else {
                break;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        String arr[] = { "flow", "flower", "flight" };
        Solution_27 s = new Solution_27();
        String res = s.longestPrefix(arr);
        System.out.println(res);
    }
}