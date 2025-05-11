import java.util.ArrayList;
import java.util.HashMap;

public class Solution_18 {
    public ArrayList<int[]> twoSum(int[] arr, int taraget) {
        ArrayList<int[]> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int[] temp = { 0, 0 };
            int difference = taraget - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == difference) {
                    temp[0] = i;
                    temp[1] = j;
                    res.add(temp);
                }
            }
        }
        return res;
    }

    // Optimal Solution
    public ArrayList<int[]> twoSumHashMap(int[] arr, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ArrayList<int[]> res = new ArrayList<>();
        int diff = 0;
        for (int i = 0; i < arr.length; i++) {
            int[] temp = { 0, 0 };
            diff = target - arr[i];
            if (hashMap.get(diff) != null) {
                temp[0] = hashMap.get(diff);
                temp[1] = i;
                res.add(temp);
            } else {
                hashMap.put(arr[i], i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 5, 8, 9 };
        int target = 14;
        Solution_18 s = new Solution_18();
        ArrayList<int[]> res = s.twoSum(arr, target);
        for (int[] it : res) {
            for (int i : it) {
                System.out.println(i);
            }
        }
        System.out.println("using hashMap");
        ArrayList<int[]> res1 = s.twoSumHashMap(arr, target);
        for (int[] it : res1) {
            for (int i : it) {
                System.out.println(i);
            }
        }

    }
}
