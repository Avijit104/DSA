import java.util.ArrayList;

public class Solution_23 {
    void rearrangeArray(int[] arr) {

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }

        }
        int mini = pos.size();
        if (mini > neg.size()) {
            mini = neg.size();
        }
        for (int i = 0; i < mini; i++) {
            arr[i * 2] = pos.get(i);
            arr[i * 2 + 1] = neg.get(i);
        }

        int index = mini * 2;
        if (pos.size() > neg.size()) {
            for (int j = mini; j < pos.size(); j++) {
                arr[index] = pos.get(j);
                index++;
            }
        } else {
            for (int j = mini; j < neg.size(); j++) {
                arr[index] = neg.get(j);
                index++;
            }

        }

    }

    public static void main(String[] args) {
        Solution_23 s = new Solution_23();
        int[] arr = { 1, 2, 3, -4, -5, 6 };
        s.rearrangeArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " , ");
        }
    }
}