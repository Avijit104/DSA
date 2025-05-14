import java.util.ArrayList;

class Solution_22 {
    public void rearrangeArray(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i : arr) {
            if (i < 0) {
                neg.add(i);
            } else {
                pos.add(i);
            }
        }
        for (int i = 0; i < (int) arr.length / 2; i++) {
            arr[2 * i] = pos.get(i);
            arr[2 * i + 1] = neg.get(i);
        }
    }

    // Optimal Solution
    public int[] rearrangeArrayOptimal(int[] arr) {
        int pos = 0;
        int neg = 1;
        int[] ans = new int[arr.length];
        for (int i : arr) {
            if (i < 0) {
                ans[neg] = i;
                neg = neg + 2;
            } else {
                ans[pos] = i;
                pos = pos + 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, -2, -5, 2, -4 };
        Solution_22 s = new Solution_22();
        s.rearrangeArray(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("optimal solution");
        int[] ans = s.rearrangeArrayOptimal(arr);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}