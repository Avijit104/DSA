import java.util.ArrayList;

// Optimal Solution
public class Solution_25 {
    ArrayList<Integer> leaders(int[] arr) {
        int max = 0;
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                res.add(max);
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int arr[] = { 10, 22, 12, 3, 0, 6 };
        Solution_25 s = new Solution_25();
        ArrayList<Integer> res = s.leaders(arr);
        for (Integer i : res) {
            System.out.print(i + ", ");

        }
    }
}
